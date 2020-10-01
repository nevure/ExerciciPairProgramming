/**
 * 
 */
package com.floristeria.domain;

/**
 * @author ru
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
	public static String [] listaTipos() {
		String[] elementos = new String[2];
		int i=0;
		
		for (TipoMaterial valor : TipoMaterial.values()){
			elementos[i] = valor.toString();
	    }
	    return elementos;
	}
		
}