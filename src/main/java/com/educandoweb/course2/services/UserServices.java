package com.educandoweb.course2.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.ResourceAccessException;

import com.educandoweb.course2.entities.User;
import com.educandoweb.course2.repositories.UserRepository;
import com.educandoweb.course2.services.exceptions.ResourceNotFoundExpeption;

@Service
public class UserServices {
	
	
	@Autowired
	private UserRepository repository;
	
	public List<User> FindAll() {
		return  repository.findAll();
		
	}
	
	public User findById(Long id) {
		Optional<User> obj = repository.findById(id);
		return obj.orElseThrow(() -> new ResourceNotFoundExpeption(id));
		
	}
	
	public User insert(User obj) {
		return repository.save(obj);
		
	}
	
	public void delete(Long id) {
		repository.deleteById(id);
		
	}
	
	public User update(Long id, User obj) {
		User entity = repository.getReferenceById(id);
		updateData(entity, obj);
		return repository.save(entity);
	}

	private void updateData(User entity, User obj) {
		entity.setName(obj.getName());
		entity.setEmail(obj.getEmail());
		entity.setPhone(obj.getPhone());
	}
	

}
