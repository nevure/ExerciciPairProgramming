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

		// todo
	}

	public void añadirArbol(Arboles arbol) {
		listaArboles.add(arbol);
	}

	public void añadirFlor(Flores flor) {
		//todo
	}

	public void añadirDecoracion(Decoracion deco) {
		//todo
	}

	
	//Getters auto-generados por eclipse
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
