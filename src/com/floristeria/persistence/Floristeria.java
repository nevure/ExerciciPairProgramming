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

	// Constructor sin par�metros
	public Floristeria() {

	}

	/**
	 * Constructor
	 * 
	 * @param nombre nombre de la floristeria
	 */

	public Floristeria(String nombre) throws CampoVacioException {

		/**
		 * @throws Lanzar excepci�n si el campo nombre est� vac�o
		 */

		if (nombre.isEmpty()) {
			throw new CampoVacioException("Ha dejado el campo nombre vacio");
		}

		this.nombre = nombre;

	}

	// M�todos para a�adir elementos a las listas
	public void anadirArbol(Arboles arbol) {
		listaArboles.add(arbol); // Se a�ade a la listaArboles
	}

	public void anadirFlor(Flores flor) {
		listaFlores.add(flor);
	}

	public void anadirDecoracion(Decoracion deco) {
		listaDecoraciones.add(deco);
	}

	/**
	 * @return devuelve lista de arboles
	 */
	public List<Arboles> getListaArboles() {
		return listaArboles;
	}

	/**
	 * @return devuelve lista de flores
	 */
	public List<Flores> getListaFlores() {
		return listaFlores;
	}

	/**
	 * @return devuelve lista de decoraciones
	 */
	public List<Decoracion> getListaDecoraciones() {
		return listaDecoraciones;
	}

}
