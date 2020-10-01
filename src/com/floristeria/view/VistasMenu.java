/**
 * 
 */
package com.floristeria.view;

import javax.swing.JOptionPane;

/**
 * @author rub
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
	
	
	public String[] menuConPreguntas(String[] preguntas) {
		
		String respuestas[] = new String[preguntas.length];
		int i = 0;
		
		for (String pregunta: preguntas) {
		
			while (respuestas[i] == null || respuestas[i].length() < 3) {
				respuestas[i] = JOptionPane.showInputDialog(
						   null,
						   pregunta + "(Campo obligatorio",
						   "")	;			
			}
					
			i++;		
		}
		return respuestas;
	}
	

}
