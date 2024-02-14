package com.educandoweb.course2.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educandoweb.course2.entities.Product;
import com.educandoweb.course2.repositories.ProductRepository;

@Service
public class ProductServices {
	
	
	@Autowired
	private ProductRepository repository;
	
	public List<Product> FindAll() {
		return  repository.findAll();
		
	}
	
	public Product findById(Long id) {
		Optional<Product> obj = repository.findById(id);
		return obj.get();
		
	}

}
