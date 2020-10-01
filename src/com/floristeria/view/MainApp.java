package com.floristeria.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import com.floristeria.application.FloristeriaController;
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

		int opcionMenuAPP=0, opcionMenuUsuario=0;
		//ControladorVistaMenu miControlador = new ControladorVistaMenu();
		VistasMenu vistaMenu = new VistaMenu;

		//Mientras no escogamos la opción de salir.

		while ((opcionMenuAPP = vistaMenu.menuOpciones(new String[] {"Nuevo Árbol", "Nueva Flor", "Nueva Decoración", "Listar Stock", "Salir"}))!= 4) {
			switch (opcionMenuAPP) {
			case 0:
				
				break;
			case 1:
				break;

			default:
				break;
			}
		
			
		}
		
		
		
		
		// ------------------------------------------------------- CREAR ARBOLES

		while (isArbolCreado == false) {

			try {
				preguntaCrearArbol = JOptionPane.showInputDialog("�Desea a�adir un �rbol? SI o NO");

				switch (preguntaCrearArbol.toLowerCase()) {
				case "si":

					try {

						controlador.crearArbol(JOptionPane.showInputDialog("Introduce el nombre del �rbol"),
								Double.parseDouble(JOptionPane
										.showInputDialog("Introduce la altura (la medida de medici�n es en cm)")),
								Double.parseDouble(JOptionPane.showInputDialog("Introduce el precio")));

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

				case "no":
					isArbolCreado = true;
					break;

				default:
					JOptionPane.showMessageDialog(null, "Ha introducido mal la palabra", "Alert",
							JOptionPane.WARNING_MESSAGE);
					break;
				}

			} catch (NullPointerException ee) {
				JOptionPane.showMessageDialog(null, "Ha cerrado las ventanas. \nVuelva a cargar los datos.", "Alert",
						JOptionPane.WARNING_MESSAGE);

			}

		}

		// ------------------------------------------------------- CREAR FLORES

		while (isFlorCreada == false) {

			try {
				preguntaAnadirFlor = JOptionPane.showInputDialog("�Desea a�adir una Flor? SI o NO");

				switch (preguntaAnadirFlor.toLowerCase()) {

				case "si":
					try {
						controlador.crearFlor(JOptionPane.showInputDialog("Introduce el nombre de la flor"),
								JOptionPane.showInputDialog("Introduce el color"),
								Double.parseDouble(JOptionPane.showInputDialog("Introduce el precio")));

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

				case "no":
					isFlorCreada = true;
					break;

				default:
					JOptionPane.showMessageDialog(null, "Ha introducido mal la palabra", "Alert",
							JOptionPane.WARNING_MESSAGE);
					break;

				}

			} catch (NullPointerException ee) {
				JOptionPane.showMessageDialog(null, "Ha cerrado las ventanas. \nVuelva a cargar los datos.", "Alert",
						JOptionPane.WARNING_MESSAGE);

			}

		}

//			controlador.crearFlor("Margarita", "Blanco", 12.00);
//			controlador.crearFlor("Hortensia", "Lila", 15.00);

		// ------------------------------------------------------------ CREAR DECORACION

		while (isDecoracionCreada == false) {

			try {

				preguntaAnadirDecoracion = JOptionPane.showInputDialog("�Desea a�adir una Decoraci�n? SI o NO");

				switch (preguntaAnadirDecoracion.toLowerCase()) {
				case "si":

					try {

						controlador.crearDecoracion(JOptionPane.showInputDialog("Introduce el nombre de la decoraci�n"),
								JOptionPane.showInputDialog("Introduce el material. Pl�stico o madera"),
								Double.parseDouble(JOptionPane.showInputDialog("Introduce el precio")));

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

				case "no":
					isDecoracionCreada = true;
					break;

				default:
					JOptionPane.showMessageDialog(null, "Ha introducido mal la palabra", "Alert",
							JOptionPane.WARNING_MESSAGE);
					break;

				}

			} catch (NullPointerException ee) {
				JOptionPane.showMessageDialog(null, "Ha cerrado las ventanas. \nVuelva a cargar los datos.", "Alert",
						JOptionPane.WARNING_MESSAGE);

			}

		}

//			controlador.crearDecoracion("Maceta", "Pl�stico", 8);
//			controlador.crearDecoracion("Florero", "Madera", 18);

		// -------------------------------------------- IMPRIMIR STOCK

		
		Marco marco = new Marco();

		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		marco.setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String resultado = controlador.imprimirStock();

		System.out.println(resultado);

		System.out.println("\n Gracias y hasta la pr�xima!");

	}

}
