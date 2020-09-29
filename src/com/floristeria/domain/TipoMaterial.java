/**
 * 
 */
package com.floristeria.domain;

import java.util.PrimitiveIterator.OfDouble;

/**
 * @author ru
 *
 */
public enum TipoMaterial {
	PLASTICO,
	MADERA;
	
	public boolean existe(String tipo) {
	    for (TipoMaterial valor : TipoMaterial.values()){
	        if (valor.name().equalsIgnoreCase(tipo))
	            return true;
	    }
	    return false;
	}
}
