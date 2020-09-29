package com.floristeria.application;

import com.floristeria.domain.Arboles;
import com.floristeria.excepciones.CampoVacioException;
import com.floristeria.persistence.Floristeria;


public class FloristeriaController {

	private Floristeria floristeria = new Floristeria();

	//Crear floristeria - nombre
	public void crearFloristeria(String nombre) throws CampoVacioException {

		if (nombre.isEmpty()) {
			throw new CampoVacioException("Ha dejado el campo nombre vacio");
		}

		// Le damos nombre al negocio
		floristeria = new Floristeria(nombre);

	}

	//Crear árbol
	public void crearArbol(String nombre, double altura, double precio)
			throws CampoVacioException, IllegalArgumentException {

		Arboles arbol = new Arboles(nombre, altura, precio);
		floristeria.añadirArbol(arbol);

	}
	
	//Crear flor
	public void crearFlor(String nombre, String color, double precio)
			throws CampoVacioException, IllegalArgumentException {
		//todo
	}

	//Crear decoración
	public void crearDecoracion(String nombre, String material, double precio)
			throws CampoVacioException, IllegalArgumentException {
		//todo
		
	}

	
	//Imprimir stock del negocio
	public String imprimirStock() {
		//todo
		return "resultado";
	}

}
