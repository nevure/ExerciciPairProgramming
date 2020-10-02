/**
 * 
 */
package com.floristeria.domain;

/**
 * 
 * Clase enum para el tipo de Material de la decoración. 
 * Permitimos así que se pueda agregar más tipos sin 
 * necesidad de tocar la clase de decoración.
 * 
 * @author Victoría Parra
 * @author Rubén Rodríguez
 *
 */
public enum TipoMaterial {
	PLASTICO,
	MADERA;
	
	public static TipoMaterial existe(String tipo) {
	    for (TipoMaterial valor : TipoMaterial.values()){
	        if (valor.name().equalsIgnoreCase(tipo))
	            return valor;
	    }
	    return null;
	}
	
	/**
	 * 
	 * @return devuelve el listado actual de tipos de material.
	 * 
	 */
	public static String [] listaTipos() {
		String[] elementos = new String[2];
		int i=0;
		
		for (TipoMaterial valor : TipoMaterial.values()){
			elementos[i] = valor.toString();
			i++;
	    }
	    return elementos;
	}
		
}