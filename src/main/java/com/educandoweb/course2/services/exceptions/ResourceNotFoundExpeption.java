package com.educandoweb.course2.services.exceptions;

public class ResourceNotFoundExpeption  extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
	public ResourceNotFoundExpeption(Object id) {
		super("Resource not found. id " + id);
		
	}

}
