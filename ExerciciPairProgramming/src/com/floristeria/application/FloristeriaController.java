package com.floristeria.application;

import com.floristeria.domain.Arboles;
import com.floristeria.domain.Decoracion;
import com.floristeria.domain.Flores;
import com.floristeria.excepciones.CampoVacioException;
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

	// Crear árbol
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

	// Crear decoración
	public void crearDecoracion(String nombre, String material, double precio)
			throws CampoVacioException, IllegalArgumentException {

		Decoracion deco = new Decoracion(nombre, material, precio);
		floristeria.anadirDecoracion(deco);

	}

	// Imprimir stock del negocio
	public String imprimirStock() {

		String resultado = "\tArboles: " + "\n";

		for (int i = 0; i < floristeria.getListaArboles().size(); i++) {

			resultado += "\t" + floristeria.getListaArboles().get(i).toString() + "\n";
		}

		resultado += "\tFlores: " + "\n";

		for (int i = 0; i < floristeria.getListaFlores().size(); i++) {

			resultado += "\t" + floristeria.getListaFlores().get(i).toString() + "\n";
		}

		resultado += "\tDecoración: " + "\n";

		for (int i = 0; i < floristeria.getListaDecoraciones().size(); i++) {

			resultado += "\t" + floristeria.getListaDecoraciones().get(i).toString() + "\n";
		}

		return resultado;
	}

}
