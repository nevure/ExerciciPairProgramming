package com.floristeria.domain;

import com.floristeria.excepciones.CampoVacioException;

public class Flores implements Plantas {

	private String nombre;

	private String color;

	private double precio;

	/**
	 * Constructor
	 * 
	 * @param nombre nombre de la flor
	 * 
	 * @param color  color de la flor
	 * 
	 * @param precio precio de la flor
	 */

	public Flores(String nombre, String color, double precio) throws CampoVacioException, IllegalArgumentException {

		/**
		 * @throws Lanzar excepción si los campos están vacíos o el precio es un número
		 *                negativo.
		 */

		if (nombre.isEmpty() || color.isEmpty()) {

			throw new CampoVacioException("Ha dejado el campo nombre o color vacios");

		} else if (precio < 0) {

			throw new IllegalArgumentException("Ha introducido un número inferior a 0");

		} else {

			this.nombre = nombre;
			this.color = color;
			this.precio = precio;
		}

	}

	@Override
	public String getDescripcion() {
		// TODO Auto-generated method stub
		return "Esto es una flor";
	}

	@Override
	public String toString() {
		return "\t Nombre: " + nombre + ", Color: " + color + ", Precio: " + precio;
	}

}
