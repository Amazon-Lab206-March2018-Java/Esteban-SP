package com.poesteba.productscategories.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.poesteba.productscategories.models.Category;
import com.poesteba.productscategories.models.Product;
import com.poesteba.productscategories.repositories.ProductRepo;

@Service
public class ProductService {
	
	private final ProductRepo pr;
	public ProductService(ProductRepo pr) {
		this.pr = pr;
	}
	
	public List<Product> allProducts(){
		return pr.findAll();		
	}
	
	public void addProduct(Product product) {
		pr.save(product);
	}
	
	public Product getProduct(Long id) {
		return pr.findById(id).get();
	}
	
	public List<Product> getProductsNotRelated(Category cat){
		return pr.findByCategoriesNotContaining(cat);
	}
	
	public void addCategoryToProduct(Category cat, Product prod) {
		List<Category> currentCategories = prod.getCategories();
		currentCategories.add(cat);
		prod.setCategories(currentCategories);
		pr.save(prod);
	}
}
