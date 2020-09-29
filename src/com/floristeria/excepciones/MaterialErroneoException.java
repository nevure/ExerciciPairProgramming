/**
 * 
 */
package com.floristeria.excepciones;
import java.lang.Exception;

/**
 * @author ru
 *
 */
public class MaterialErroneoException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MaterialErroneoException() {
		
	}
	
	public MaterialErroneoException(String msj_error) {
		
		super(msj_error);
	}
}
