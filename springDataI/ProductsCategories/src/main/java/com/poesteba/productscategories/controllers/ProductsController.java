package com.poesteba.productscategories.controllers;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.poesteba.productscategories.models.Category;
import com.poesteba.productscategories.models.Product;
import com.poesteba.productscategories.services.CategoryService;
import com.poesteba.productscategories.services.ProductService;

@Controller
public class ProductsController {
	
	private final ProductService ps;
	private final CategoryService cs;
	public ProductsController(ProductService ps,CategoryService cs) {
		this.ps = ps;
		this.cs = cs;
	}
	
	@RequestMapping("/")
	public String index() {
		return "index";
	}	
	@RequestMapping("/products/new")
	public String newProduct(@ModelAttribute("product") Product product) {
		return "newProduct";
	}	
	@PostMapping("/products/new")
	public String addProduct(@Valid @ModelAttribute("product") Product product,BindingResult res) {
		if (res.hasErrors()) {
			return "newProduct";
		} else {
			ps.addProduct(product);
			return "redirect:/";
		}
	}
	
	@RequestMapping("/products/{id}")
	public String showProduct(@PathVariable("id") Long id, Model m) {
		m.addAttribute("product", ps.getProduct(id));
		m.addAttribute("unrelatedCatList", cs.getCategoriesNotRelated(ps.getProduct(id)));
		return "showProduct";
	}	
	@PostMapping("/products/{id}/add_category")
	public String addProduct(@PathVariable("id") Long id, @RequestParam("cat_id") Long cat_id) {
		Product prod = ps.getProduct(id);
		Category cat = cs.getCategory(cat_id);
		ps.addCategoryToProduct(cat, prod);
		return "redirect:/products/"+id;
	}
	
	
}