package com.floristeria.domain;

import com.floristeria.excepciones.CampoVacioException;
import com.floristeria.excepciones.MaterialErroneoException;

public class Decoracion {

	private String nombre;

	private String material;

	private double precio;

	public Decoracion(String nombre, String material, double precio)
			throws CampoVacioException, MaterialErroneoException, IllegalArgumentException {

		if (!material.equalsIgnoreCase("Plástico") && !material.equalsIgnoreCase("Madera")) {

			throw new MaterialErroneoException("El material solo puede ser madera o plastico");

		} else if (nombre.isEmpty()) {
			throw new CampoVacioException("Ha dejado el campo nombre vacio");

		} else if (precio < 0) {
			throw new IllegalArgumentException("Ha introducido un número inferior a 0");

		} else {

			this.nombre = nombre;

			this.material = material;

			this.precio = precio;
		}
	}

	@Override
	public String toString() {
		return "\t Nombre: " + nombre + ", Material: " + material + ", Precio: " + precio;
	}

}
