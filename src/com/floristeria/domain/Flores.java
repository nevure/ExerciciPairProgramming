package com.floristeria.domain;

import com.floristeria.excepciones.CampoVacioException;

public class Flores implements Plantas {

	private String nombre;

	private String color;

	private double precio;

	public Flores(String nombre, String color, double precio) throws CampoVacioException, IllegalArgumentException {
		// todo
	}

	@Override
	public String getDescripcion() {
		// TODO Auto-generated method stub
		return "Esto es una flor";
	}

}
