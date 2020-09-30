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
	
	public TipoMaterial existe(String tipo) {
	    for (TipoMaterial valor : TipoMaterial.values()){
	        if (valor.name().equalsIgnoreCase(tipo))
	            return valor;
	    }
	    return null;
	}
}