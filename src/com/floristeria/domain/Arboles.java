package com.floristeria.domain;

import com.floristeria.excepciones.CampoVacioException;

public class Arboles implements Plantas {

	private String nombre;

	private double altura;

	private double precio;

	public Arboles(String nombre, double altura, double precio) throws CampoVacioException, IllegalArgumentException {
		//todo
	}

	@Override
	public String getDescripcion() {
		// TODO Auto-generated method stub
		return "Esto es un árbol";
	}


}
