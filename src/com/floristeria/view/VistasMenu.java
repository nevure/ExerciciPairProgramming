/**
 * 
 */
package com.floristeria.view;

import javax.swing.JOptionPane;

/**
 * 
 * Clase para manejar los elementos visuales de swing. 
 * Los método reciben una cadena (la pregunta= y devuelve la respuesta. 
 * Aquí no se controla las respuestas.
 * 
 * 
 * @author Victoria Parra
 * @author Rubén Rodríguez
 *
 */
public class VistasMenu {
	
	
	/**
	 * Método que muestra una serie de opciones donde elegir.
	 * @param opciones  lista de opciones a mostrar en pantalla
	 * @return devuelve la opción escogida.
	 */
	public int menuOpciones(String[] opciones) {
		
		int seleccion = JOptionPane.showOptionDialog(
				   null,
				   "Seleccione opcion", 
				   "Selector de opciones",
				   JOptionPane.YES_NO_CANCEL_OPTION,
				   JOptionPane.QUESTION_MESSAGE,
				   null,    // null para icono por defecto.
				   opciones,  
				   "opcion 1");

		
		return seleccion;	  
		
	}
	

	/**
	 * 
	 * Método que recibe una cadena, la pregunta; y devuelve otra cadena, la respuesta.
	 * 
	 * @param pregunta
	 * @return cadena que es la respuesta.
	 */
	public String preguntaSimple(String pregunta) {
		
		String respuesta = null;
		
		while (respuesta == null ) {
				respuesta = JOptionPane.showInputDialog(
						   null,
						   pregunta + " (Campo obligatorio)",
						   "")	;			
			}
	
		return respuesta;
	}
	
	/**
	 * Método que muestra un desplegable con opciones.
	 * 
	 * @param opciones del desplegable
	 * @param mensaje informativo sobre el desplegable
	 * @return cadena con la opción elegida.
	 */
	
	public String preguntaOpciones(String [] opciones, String mensaje) {
		return (String) JOptionPane.showInputDialog(null,mensaje, "Elegir",JOptionPane.QUESTION_MESSAGE,null,opciones, opciones[0]);

	}
	
	/**
	 * Método que recibe un String y lo muestra en un panel.
	 * @param listado
	 */
	public void mostrarListado( String listado) {	
		JOptionPane.showMessageDialog(
				   null,
				   listado);
	}
	
	

}
