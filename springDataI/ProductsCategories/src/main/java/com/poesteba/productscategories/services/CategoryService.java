package com.poesteba.productscategories.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.poesteba.productscategories.models.Category;
import com.poesteba.productscategories.models.Product;
import com.poesteba.productscategories.repositories.CategoryRepo;

@Service
public class CategoryService {

	private final CategoryRepo cr;	
	public CategoryService(CategoryRepo cr) {
		this.cr = cr;
	}
	
	public List<Category> allCategories(){
		return cr.findAll();
	}
	
	public void addCategory(Category category) {
		cr.save(category);
	}
	
	public Category getCategory(Long id) {
		if (cr.findById(id).isPresent()) {
			return cr.findById(id).get();			
		} else {
			return null;
		}
	}
	
	public void addProductToCategory(Product prod, Category cat) {
		List<Product> currentProducts = cat.getProducts();
		currentProducts.add(prod);
		cat.setProducts(currentProducts);
		cr.save(cat);
	}
	
	public List<Category> getCategoriesNotRelated(Product prod){
		return cr.findByProductsNotContaining(prod);
	}
		
}
