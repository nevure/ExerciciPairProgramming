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

		String resultado = "\tArboles: " + "\n";
		StringBuilder listado = new StringBuilder();
		 //  list.forEach(b::append);

		listado.append("\tArboles: " + "\n");
		floristeria.getListaArboles().forEach(listado::append);
		listado.append("\tFlores: " + "\n");
		floristeria.getListaFlores().forEach(listado::append);
		listado.append("\tDecoración: " + "\n");
		floristeria.getListaDecoraciones().forEach(listado::append);

		/*
		for (int i = 0; i < floristeria.getListaArboles().size(); i++) {

			resultado += "\t" + floristeria.getListaArboles().get(i).toString() + "\n";
		}

		resultado += "\tFlores: " + "\n";

		for (int i = 0; i < floristeria.getListaFlores().size(); i++) {

			resultado += "\t" + floristeria.getListaFlores().get(i).toString() + "\n";
		}

		resultado += "\tDecoraci�n: " + "\n";

		for (int i = 0; i < floristeria.getListaDecoraciones().size(); i++) {

			resultado += "\t" + floristeria.getListaDecoraciones().get(i).toString() + "\n";
		}

		//return resultado;*/
		return listado.toString();
	}

}
