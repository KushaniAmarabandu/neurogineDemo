package com.example.neurogine.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.neurogine.models.Product;
import com.example.neurogine.services.ProductService;
//Question 3
@Controller
public class ProductController {

	@Autowired
	ProductService productService;

	@GetMapping("/product")
	public List<Product> retrieveAllProducts() {
		return productService.findAll();
	}
	
	@GetMapping("/product/{id}")
	public Product getProductById(@PathVariable("id") int id) {
		return productService.findById(id);
	}

	@PostMapping("/addproduct")
	private void addProduct(@RequestBody Product product) {
		productService.addProduct(product);
	}
	
	@PutMapping("/updateproduct")
	private void updateProduct(@RequestBody Product product) {
		productService.updateProduct(product);

	}
	
	@PutMapping("/deleteproduct/{id}")
	private void deleteProduct(@PathVariable("id") int id) {
		productService.deleteProduct(id);

	}
}
