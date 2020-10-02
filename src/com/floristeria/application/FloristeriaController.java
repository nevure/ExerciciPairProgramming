package com.floristeria.application;

import com.floristeria.domain.Arboles;
import com.floristeria.domain.Decoracion;
import com.floristeria.domain.Flores;
import com.floristeria.excepciones.CampoVacioException;
import com.floristeria.excepciones.MaterialErroneoException;
import com.floristeria.persistence.Floristeria;

public class FloristeriaController {

	private Floristeria floristeria = new Floristeria();

	// Crear floristeria - nombre
	public void crearFloristeria(String nombre) throws CampoVacioException {

		if (nombre.isEmpty()) {
			throw new CampoVacioException("Ha dejado el campo nombre vacio");
		}

		// Le damos nombre al negocio
		floristeria = new Floristeria(nombre);

	}

	// Crear �rbol
	public void crearArbol(String nombre, double altura, double precio)
			throws CampoVacioException, IllegalArgumentException {

		Arboles arbol = new Arboles(nombre, altura, precio);
		floristeria.anadirArbol(arbol);

	}

	// Crear flor
	public void crearFlor(String nombre, String color, double precio)
			throws CampoVacioException, IllegalArgumentException {

		Flores flor = new Flores(nombre, color, precio);
		floristeria.anadirFlor(flor);
	}

	// Crear decoraci�n
	public void crearDecoracion(String nombre, String material, double precio)
			throws CampoVacioException, MaterialErroneoException, IllegalArgumentException {

		Decoracion deco = new Decoracion(nombre, material, precio);
		floristeria.anadirDecoracion(deco);

	}

	// Imprimir stock del negocio
	public String imprimirStock() {

		StringBuilder listado = new StringBuilder();
		 //  list.forEach(b::append);

		listado.append("\tArboles: \n");
		floristeria.getListaArboles().forEach((arbol) -> listado.append("\n"+arbol) );
		listado.append("\nFlores: \n");
		floristeria.getListaFlores().forEach((flor) -> listado.append("\n"+flor) );
		listado.append("\nDecoración: \n");
		floristeria.getListaDecoraciones().forEach((deco) -> listado.append("\n"+deco) );

		
		return listado.toString();
	}

}
