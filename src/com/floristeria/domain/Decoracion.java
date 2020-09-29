package com.floristeria.domain;

import com.floristeria.excepciones.*;

public class Decoracion {
	
	private TipoMaterial tipoMaterial;

	private String nombre;

	private String material;

	private double precio;

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

}
