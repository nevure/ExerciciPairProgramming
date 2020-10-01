package com.floristeria.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import com.floristeria.application.FloristeriaController;
import com.floristeria.domain.TipoMaterial;
import com.floristeria.excepciones.CampoVacioException;
import com.floristeria.excepciones.MaterialErroneoException;

public class MainApp implements ActionListener {

	private static FloristeriaController controlador = new FloristeriaController();

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String preguntaCrearArbol;
		String preguntaAnadirFlor;
		String preguntaAnadirDecoracion;

		boolean isFloristeriaCreada = false;
		boolean isArbolCreado = false;
		boolean isFlorCreada = false;
		boolean isDecoracionCreada = false;

		// ------------------------------------------------------- CREAR FLORISTERIA
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

		int opcionMenuAPP=0;
		//ControladorVistaMenu miControlador = new ControladorVistaMenu();
		VistasMenu vistaMenu = new VistasMenu();

		//Mientras no escogamos la opción de salir.

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
		
		
		// -------------------------------------------- IMPRIMIR STOCK

		/*
		Marco marco = new Marco();

		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		marco.setVisible(true);*/

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String resultado = controlador.imprimirStock();

		System.out.println(resultado);

		System.out.println("\n Gracias y hasta la pr�xima!");

	}

}
