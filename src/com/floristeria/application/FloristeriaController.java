package com.floristeria.application;

import com.floristeria.domain.*;
import com.floristeria.excepciones.*;
import com.floristeria.persistence.Floristeria;

/**
 * Clase Controladora.
 * Esta clase crea una floristería y dispone de los métodos necesarios para aumentar el stock de la floristería.
 * 
 * @author Victoria Parra
 * @author Rubén Rodríguez
 *
 */

public class FloristeriaController {

	private Floristeria floristeria;

	/**
	 * 
	 * Crear una floristería asignándole un nombre a la misma.
	 * 
	 * @param nombre
	 * @throws CampoVacioException
	 */
	public void crearFloristeria(String nombre) throws CampoVacioException {

		if (nombre.isEmpty()) {
			throw new CampoVacioException("Ha dejado el campo nombre vacio");
		}

		// Le damos nombre al negocio
		floristeria = new Floristeria(nombre);

	}

	/**
	 * Creamos un árbol que agregamos a la floristería
	 * 
	 * @param nombre
	 * @param altura
	 * @param precio
	 * @throws CampoVacioException
	 * @throws IllegalArgumentException
	 */
	public void crearArbol(String nombre, double altura, double precio)
			throws CampoVacioException, IllegalArgumentException {

		Arboles arbol = new Arboles(nombre, altura, precio);
		floristeria.anadirArbol(arbol);

	}


	/**
	 * Creamos una flor que agregamos a la floristería
	 * 
	 * @param nombre
	 * @param color
	 * @param precio
	 * @throws CampoVacioException
	 * @throws IllegalArgumentException
	 */
	public void crearFlor(String nombre, String color, double precio)
			throws CampoVacioException, IllegalArgumentException {

		Flores flor = new Flores(nombre, color, precio);
		floristeria.anadirFlor(flor);
	}


	/**
	 * Creamos un elemento de decoración que agregamos a la floristería
	 * @param nombre
	 * @param material
	 * @param precio
	 * @throws CampoVacioException
	 * @throws MaterialErroneoException
	 * @throws IllegalArgumentException
	 */
	public void crearDecoracion(String nombre, String material, double precio)
			throws CampoVacioException, MaterialErroneoException, IllegalArgumentException {

		Decoracion deco = new Decoracion(nombre, material, precio);
		floristeria.anadirDecoracion(deco);

	}

	/**
	 * Método que crea una cadena formateada con el stock de la floristería
	 * 
	 * @return Cadena con el stock 
	 */
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
