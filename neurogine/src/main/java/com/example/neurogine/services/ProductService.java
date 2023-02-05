package com.example.neurogine.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.neurogine.models.Product;
@Service
public interface ProductService {

	List<Product> findAll();

	void addProduct(Product product);

	void deleteProduct(int id);

	void updateProduct(Product product);

	Product findById(int id);

}
