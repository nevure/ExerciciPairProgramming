package com.floristeria.persistence;

import java.util.ArrayList;
import java.util.List;

import com.floristeria.domain.Arboles;
import com.floristeria.domain.Decoracion;
import com.floristeria.domain.Flores;
import com.floristeria.excepciones.CampoVacioException;

public class Floristeria {

	private String nombre;

	private List<Arboles> listaArboles = new ArrayList<Arboles>();

	private List<Flores> listaFlores = new ArrayList<Flores>();

	private List<Decoracion> listaDecoraciones = new ArrayList<Decoracion>();

	public Floristeria() {

	}

	public Floristeria(String nombre) throws CampoVacioException {

		if (nombre.isEmpty()) {
			throw new CampoVacioException("Ha dejado el campo nombre vacio");
		}

		this.nombre = nombre;

		System.out.println(nombre);

	}

	public void anadirArbol(Arboles arbol) {
		listaArboles.add(arbol);
	}

	public void anadirFlor(Flores flor) {
		listaFlores.add(flor);
	}

	public void anadirDecoracion(Decoracion deco) {
		listaDecoraciones.add(deco);
	}

	// Getters auto-generados por eclipse
	public List<Arboles> getListaArboles() {
		return listaArboles;
	}

	public List<Flores> getListaFlores() {
		return listaFlores;
	}

	public List<Decoracion> getListaDecoraciones() {
		return listaDecoraciones;
	}

}
