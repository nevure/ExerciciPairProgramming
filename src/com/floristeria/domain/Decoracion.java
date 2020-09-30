package com.floristeria.domain;

import com.floristeria.excepciones.*;
import com.floristeria.domain.*;

public class Decoracion {
	
	private String nombre;
	
	private TipoMaterial tipoMaterial;

	private String material;

	private double precio;

	public Decoracion(String nombre, String material, double precio)
			throws CampoVacioException, MaterialErroneoException, IllegalArgumentException {

		//if (!material.equalsIgnoreCase("Pl�stico") && !material.equalsIgnoreCase("Madera")) {
		if ()
			throw new MaterialErroneoException("El material solo puede ser madera o plastico");

		} else if (nombre.isEmpty()) {
			throw new CampoVacioException("Ha dejado el campo nombre vacio");

		} else if (precio < 0) {
			throw new IllegalArgumentException("Ha introducido un n�mero inferior a 0");

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
