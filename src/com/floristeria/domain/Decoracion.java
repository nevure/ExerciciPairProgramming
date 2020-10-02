package com.floristeria.domain;

import com.floristeria.excepciones.*;

public class Decoracion {
	
	private TipoMaterial tipoMaterial;

	private String nombre;

	private double precio;

	
	/**
	 * Constructor
	 * 
	 * @param nombre       nombre de la decoraci�n
	 * 
	 * @param TipoMaterial tipo de material de la decoraci�n
	 * 
	 * @param precio       precio de la decoraci�n
	 */

	public Decoracion(String nombre, String material, double precio)
			throws CampoVacioException, MaterialErroneoException, IllegalArgumentException {

		tipoMaterial = TipoMaterial.existe(material);

		/**
		 * @throws Lanzar excepci�n si el TipoMaterial es nulo, si el campo nombre est�
		 *                vac�o, o si el precio tiene un numero en negativo.
		 */
		if (tipoMaterial == null) {
			throw new MaterialErroneoException("El material solo puede ser madera o pl�stico");

		} else if (nombre.isEmpty()) {
			throw new CampoVacioException("Ha dejado el campo nombre vacio");

		} else if (precio < 0) {
			throw new IllegalArgumentException("Ha introducido un n�mero inferior a 0");

		} else {
			this.nombre = nombre;

			this.precio = precio;
		}
	}

	@Override
	public String toString() {
		return "\t Nombre: " + nombre + ", Material: " + tipoMaterial + ", Precio: " + precio;
	}
>>>>>>> Rama-1

}
