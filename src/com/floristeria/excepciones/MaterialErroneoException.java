package com.floristeria.excepciones;

public class MaterialErroneoException extends Exception {

	private static final long serialVersionUID = 1L;

	public MaterialErroneoException() {
		
	}
	
	public MaterialErroneoException(String msj_error) {
		
		super(msj_error);
	}
}