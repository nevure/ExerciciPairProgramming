package com.floristeria.domain;

import com.floristeria.excepciones.*;

public class Arboles implements Plantas {

	private String nombre;

	private double altura;

	private double precio;

	public Arboles(String nombre, double altura, double precio) throws CampoVacioException, IllegalArgumentException {

		if (nombre.isEmpty()) {

			throw new CampoVacioException("Has dejado el campo nombre vacio");
		}

		this.nombre = nombre;

		if (altura < 0 || precio < 0) {


			throw new IllegalArgumentException("Has introducido un número inferior a 0");

		}

		this.altura = altura;

		this.precio = precio;
	}

	@Override
	public String getDescripcion() {
		// TODO Auto-generated method stub
		return "Esto es un árbol";
	}

	@Override
	public String toString() {
		return "\t Nombre: " + nombre + ", Altura: " + altura + " cm, Precio: " + precio;
	}

}