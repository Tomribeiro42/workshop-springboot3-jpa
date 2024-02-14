package com.educandoweb.course2.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educandoweb.course2.entities.enums.Category;
import com.educandoweb.course2.repositories.CategoryRepository;

@Service
public class CategoryServices {
	
	
	@Autowired
	private CategoryRepository repository;
	
	public List<Category> FindAll() {
		return  repository.findAll();
		
	}
	
	public Category findById(Long id) {
		Optional<Category> obj = repository.findById(id);
		return obj.get();
		
	}

}
