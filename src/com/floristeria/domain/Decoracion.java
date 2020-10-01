package com.floristeria.domain;

import com.floristeria.excepciones.*;

public class Decoracion {
	
	private TipoMaterial tipoMaterial;
	
	private String nombre;
	

	private double precio;

	public Decoracion(String nombre, String material, double precio)
			throws CampoVacioException, MaterialErroneoException, IllegalArgumentException {

		tipoMaterial = TipoMaterial.existe(material);
		if (tipoMaterial == null)
			throw new MaterialErroneoException("El material solo puede ser madera o plastico");

		else if (nombre.isEmpty()) {
			throw new CampoVacioException("Ha dejado el campo nombre vacio");

		} else if (precio < 0) {
			throw new IllegalArgumentException("Ha introducido un n�mero inferior a 0");

		} else {
			this.nombre = nombre;

			//this.material = material;

			this.precio = precio;
		}
	}

	@Override
	public String toString() {
		return "\t Nombre: " + nombre + ", Material: " + tipoMaterial + ", Precio: " + precio;
	}

}
