package com.poesteba.productscategories.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.poesteba.productscategories.models.Category;
import com.poesteba.productscategories.models.Product;

@Repository
public interface ProductRepo extends CrudRepository<Product, Long> {
	List<Product> findAll();
	List<Product> findByCategoriesNotContaining(Category cat);
}
