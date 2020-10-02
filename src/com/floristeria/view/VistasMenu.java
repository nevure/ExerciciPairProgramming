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
						   pregunta + " (Campo obligatorio)",
						   "")	;			
			}
					
			i++;		
		}
		return respuestas;
	}
	
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
	
	public String preguntaOpciones(String [] opciones, String mensaje) {
		return (String) JOptionPane.showInputDialog(null,mensaje, "Elegir",JOptionPane.QUESTION_MESSAGE,null,opciones, opciones[0]);

	}
	
	public void mostrarListado( String listado) {	
		JOptionPane.showMessageDialog(
				   null,
				   listado);
	}
	
	

}
