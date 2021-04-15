package com.lvbullock.productsandcategories.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lvbullock.productsandcategories.models.Category;
import com.lvbullock.productsandcategories.models.Product;
import com.lvbullock.productsandcategories.repositories.CategoryRepository;

@Service
public class CategoryService {

	@Autowired
	private CategoryRepository categoryRepo;
	
	public List<Category> getAllCategories() {
		return categoryRepo.findAll();
	}
	
	public Category createCategory(Category c) {
		return categoryRepo.save(c);
	}
	
	public Category getCategory(Long id) {
		return categoryRepo.findById(id).orElse(null);
	}
	
	public List<Category> findCategoriesNotInProduct(Product product) {
		return categoryRepo.findByProductsNotContains(product);
	}
	
	public void addProdToCategory(Product product, Category category) {
		List<Product> selectedProducts = category.getProducts();
		selectedProducts.add(product);
		this.categoryRepo.save(category);
	}
}
