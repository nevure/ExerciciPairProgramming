package com.floristeria.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import com.floristeria.application.FloristeriaController;
import com.floristeria.domain.TipoMaterial;
import com.floristeria.excepciones.CampoVacioException;
import com.floristeria.excepciones.MaterialErroneoException;
/**
 * Clase principal MAIN
 * 
 * Dos bloques. El primero para crear la floristería
 * el segundo bloque con el menú principal hasta salir de la app
 * 
 * @author Victoria Parra
 * @authon Rubén Rodríguez
 *
 */
public class MainApp implements ActionListener {

	private static FloristeriaController controlador = new FloristeriaController();

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean isFloristeriaCreada = false;
		int opcionMenuAPP=0;
		VistasMenu vistaMenu = new VistasMenu();


		/**
		 * Es obligado crear una floristería y darle un nombre.
		 * Manejamos con un try catch que introduzca un nombre y que no quiera salir.
		 */
		while (isFloristeriaCreada == false) {

			try {

				controlador.crearFloristeria(JOptionPane.showInputDialog("Introduce el nombre del negocio"));

			} catch (CampoVacioException e) {
				JOptionPane.showMessageDialog(null, e.getMessage() + ". Vuelva a introducir el nombre", "Alert",
						JOptionPane.WARNING_MESSAGE);
				continue;

			} catch (NullPointerException ee) {
				JOptionPane.showMessageDialog(null, "Ha cerrado las ventanas. \nVuelva a cargar los datos.", "Alert",
						JOptionPane.WARNING_MESSAGE);
				continue;
			}

			isFloristeriaCreada = true;

		}


		/**
		 * Segundo bloque. Se ejecuta mientras no escoga el usuario la opción salir.
		 * 
		 *  se divide en tres opciones
		 *  Para cada opción llamamos a un método del controlador. a dicha método le pasamos un objeto de vistaMenu que lo que hace es preguntar al usuario.
		 *  Lo encerramos en un try catch para manejar cualquier dato de entrada erróneo.
		 *  
		 */
		while ((opcionMenuAPP = vistaMenu.menuOpciones(new String[] {"Nuevo Árbol", "Nueva Flor", "Nueva Decoración", "Listar Stock", "Salir"}))!= 4) {
			switch (opcionMenuAPP) {
			case 0:
				
				try {		
					controlador.crearArbol(vistaMenu.preguntaSimple("Nombre del árbol"),
							Double.parseDouble(vistaMenu.preguntaSimple("Altura en Cm:")),
							Double.parseDouble(vistaMenu.preguntaSimple("Precio del Árbol")));

				} catch (CampoVacioException e) {
					JOptionPane.showMessageDialog(null, e.getMessage() + ". Vuelva a introducir los datos", "Alert",
							JOptionPane.WARNING_MESSAGE);
					continue;

				} catch (IllegalArgumentException ex) {
					JOptionPane.showMessageDialog(null, ex.getMessage() + ". Vuelva a introducir los datos",
							"Alert", JOptionPane.WARNING_MESSAGE);
					continue;
				}

				break;		
						
			case 1:
				
				try {
					controlador.crearFlor(vistaMenu.preguntaSimple("Nombre de la flor"),
							vistaMenu.preguntaSimple("Introduce el color"),
							Double.parseDouble(vistaMenu.preguntaSimple("Introduce el precio")));

				} catch (CampoVacioException e) {
					JOptionPane.showMessageDialog(null, e.getMessage() + ". Vuelva a introducir los datos", "Alert",
							JOptionPane.WARNING_MESSAGE);
					continue;

				} catch (IllegalArgumentException ex) {
					JOptionPane.showMessageDialog(null, ex.getMessage() + ". Vuelva a introducir los datos",
							"Alert", JOptionPane.WARNING_MESSAGE);
					continue;
				}

				
				
				break;
			case 2:
				
				
				try {

					controlador.crearDecoracion(vistaMenu.preguntaSimple("Nombre de la decoración"),
							vistaMenu.preguntaOpciones(TipoMaterial.listaTipos(), "Tipo de Material"),
							Double.parseDouble(vistaMenu.preguntaSimple("Introduce el precio")));

				} catch (CampoVacioException e) {
					JOptionPane.showMessageDialog(null, e.getMessage() + ". Vuelva a introducir los datos", "Alert",
							JOptionPane.WARNING_MESSAGE);
					continue;

				} catch (IllegalArgumentException ex) {
					JOptionPane.showMessageDialog(null, ex.getMessage() + ". Vuelva a introducir los datos.",
							"Alert", JOptionPane.WARNING_MESSAGE);

					continue;

				} catch (MaterialErroneoException exe) {
					JOptionPane.showMessageDialog(null, exe.getMessage() + ". Vuelva a introducir los datos",
							"Alert", JOptionPane.WARNING_MESSAGE);
					continue;
				}

				
				break;
			case 3:
				
				vistaMenu.mostrarListado(controlador.imprimirStock());

			default:
				break;
			}
		
			
		}
		
	

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String resultado = controlador.imprimirStock();

		System.out.println(resultado);

		System.out.println("\n Gracias y hasta la pr�xima!");

	}

}
