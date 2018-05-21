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
public class CategoriesController {

	private final ProductService ps;
	private final CategoryService cs;
	
	
	public CategoriesController(CategoryService cs, ProductService ps) {
		this.cs = cs;
		this.ps = ps;
	}

	@RequestMapping("/categories/new")	
	public String newCategory(@ModelAttribute("category") Category category) {
		return "newCategory";
	}
	
	@PostMapping("/categories/new")	
	public String addCategory(@Valid @ModelAttribute("category") Category category, BindingResult res) {
		if (res.hasErrors()) {
			return "newCategory";
		}else {
			cs.addCategory(category);
			return "redirect:/";
		}
	}
	@RequestMapping("/categories/{id}")
	public String showProduct(@PathVariable("id") Long id, Model m) {
		Category cat = cs.getCategory(id);
		m.addAttribute("category", cat);
		System.out.println(cat.getName());
		m.addAttribute("unrelatedProdList", ps.getProductsNotRelated(cs.getCategory(id)));
		return "showCategory";
	}	
	@PostMapping("/categories/{id}/add_product")
	public String addProduct(@PathVariable("id") Long id, @RequestParam("prod_id") Long prod_id) {
		if (prod_id>0) {
			Product prod = ps.getProduct(prod_id);
			Category cat = cs.getCategory(id);
			ps.addCategoryToProduct(cat, prod);
			return "redirect:/categories/"+id;
		} else {
			return "redirect:/categories/"+id;
			
		}
	}
}
