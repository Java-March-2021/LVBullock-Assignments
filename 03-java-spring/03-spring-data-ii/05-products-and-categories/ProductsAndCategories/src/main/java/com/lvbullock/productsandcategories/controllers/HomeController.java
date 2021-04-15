package com.lvbullock.productsandcategories.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.lvbullock.productsandcategories.models.Category;
import com.lvbullock.productsandcategories.models.Product;
import com.lvbullock.productsandcategories.services.CategoryService;
import com.lvbullock.productsandcategories.services.ProductService;

@Controller
public class HomeController {
	@Autowired
	private ProductService productService;
	
	@Autowired
	private CategoryService categoryService;
	
	@RequestMapping("/")
	public String index(Model viewModel) {
		List<Product> products = productService.getAllProducts();
		List<Category> categories = categoryService.getAllCategories();
		viewModel.addAttribute("products", products);
		viewModel.addAttribute("categories", categories);
		return "index.jsp";
	}
	
	@RequestMapping("/new/product")
	public String newProduct(@ModelAttribute("product") Product product) {
		return "newProduct.jsp";
	}
	
	@PostMapping("/create/product")
	public String createProduct(@Valid @ModelAttribute("product") Product product, BindingResult result) {
		if(result.hasErrors()) {
			return "newProduct.jsp";
		}
		productService.createProduct(product);
		return "redirect:/";
	}
	
	@RequestMapping("/new/category")
	public String newCategory(@ModelAttribute("category") Category category) {
		return "newCategory.jsp";
	}
	
	@PostMapping("/create/category")
	public String createCategory(@Valid @ModelAttribute("category") Category category, BindingResult result) {
		if(result.hasErrors()) {
			return "newCategory.jsp";
		}
		categoryService.createCategory(category);
		return "redirect:/";
	}
	
	@GetMapping("/product/{id}")
	public String showProduct(@PathVariable("id") Long id, Model viewModel) {
		Product thisProduct = productService.getProduct(id);
		viewModel.addAttribute("product", thisProduct);
		List<Category> categoryNotInProduct = categoryService.findCategoriesNotInProduct(thisProduct);
		viewModel.addAttribute("catNotInProduct", categoryNotInProduct); 
		return "showProduct.jsp";
	}
	
	@PostMapping("/product/{id}")
	public String addCategoryToProduct(@RequestParam("category") Long categoryId, @PathVariable("id") Long productId) {
		Product thisProduct = productService.getProduct(productId);
		Category selectCategory = categoryService.getCategory(categoryId);
		productService.addCategoryToProduct(selectCategory, thisProduct);
		return "redirect:/product/" + productId;
	}
	
	@GetMapping("/category/{id}")
		public String showCategory(@PathVariable("id") Long id, Model viewModel) {
			Category thisCategory = categoryService.getCategory(id);
			viewModel.addAttribute("category", thisCategory);
			List<Product> productNotInCategory = productService.findProductsNotInCategory(thisCategory);
			viewModel.addAttribute("prodNotInCategory", productNotInCategory);
			return "showCategory.jsp";
		}
	@PostMapping("/category/{id}")
		public String addProductToCategory(@RequestParam("product") Long prodId, @PathVariable("id") Long catId) {
		Category thisCategory = categoryService.getCategory(catId);
		Product selectProduct = productService.getProduct(prodId);
		categoryService.addProdToCategory(selectProduct, thisCategory);
		return "redirect:/category/" + catId;
	}

}
