package com.example.neurogine.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.neurogine.models.Product;
import com.example.neurogine.repository.ProductRepository;

public class ProductServiceImpl implements ProductService {
	
	@Autowired
	ProductRepository productRepository;

	@Override
	public List<Product> findAll() {
		// TODO Auto-generated method stub
		return productRepository.findAll();
	}

	@Override
	public void updateProduct(Product product) {
		// TODO Auto-generated method stub
		Product proOptional = productRepository.findById((long) product.getId()).get();
		proOptional.setDescription(product.getDescription());
		proOptional.setName(product.getName());
		proOptional.setPrice(product.getPrice());
		productRepository.save(proOptional);
		
	}

	@Override
	public void addProduct(Product product) {
		// TODO Auto-generated method stub
		productRepository.save(product);
		
	}

	@Override
	public void deleteProduct(int id) {
		// TODO Auto-generated method stub
		Optional<Product> proOptional = productRepository.findById((long) id);
		productRepository.delete(proOptional.get());
		
	}

	@Override
	public Product findById(int id) {
		// TODO Auto-generated method stub
		return productRepository.findById((long) id).get();
	}

}
