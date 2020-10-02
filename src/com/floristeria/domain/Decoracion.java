package com.floristeria.domain;

import com.floristeria.excepciones.*;

public class Decoracion {
	
	private TipoMaterial tipoMaterial;

	private TipoMaterial tipoMaterial;

	private String nombre;

	private double precio;

<<<<<<< HEAD
	public Decoracion(String nombre, String material, double precio) throws MaterialErroneoException, CampoVacioException {

		if (!tipoMaterial.existe(material))
			throw new MaterialErroneoException();

		else if (!nombre.isEmpty())
				throw new CampoVacioException();
		else {
			
			this.nombre = nombre;
			this.material = material;
			this.precio = precio;			
		}	
	}	
=======
	/**
	 * Constructor
	 * 
	 * @param nombre       nombre de la decoración
	 * 
	 * @param TipoMaterial tipo de material de la decoración
	 * 
	 * @param precio       precio de la decoración
	 */

	public Decoracion(String nombre, String material, double precio)
			throws CampoVacioException, MaterialErroneoException, IllegalArgumentException {

		tipoMaterial = TipoMaterial.existe(material);

		/**
		 * @throws Lanzar excepción si el TipoMaterial es nulo, si el campo nombre está
		 *                vacío, o si el precio tiene un numero en negativo.
		 */
		if (tipoMaterial == null) {
			throw new MaterialErroneoException("El material solo puede ser madera o plástico");

		} else if (nombre.isEmpty()) {
			throw new CampoVacioException("Ha dejado el campo nombre vacio");

		} else if (precio < 0) {
			throw new IllegalArgumentException("Ha introducido un nï¿½mero inferior a 0");

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
