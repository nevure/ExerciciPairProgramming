package com.floristeria.view;

import javax.swing.JOptionPane;

import com.floristeria.application.FloristeriaController;
import com.floristeria.excepciones.CampoVacioException;

public class MainApp {

	private static FloristeriaController controlador = new FloristeriaController();

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String stock;

		String preguntaCrearArbol;
		String preguntaAnadirFlor;
		String preguntaAnadirDecoracion;
		String pregImprimirStock;

		boolean isArbolCreado = false;
		boolean isFlorCreada = false;
		boolean isDecoracionCreada = false;
		boolean isStockImpreso = false;

		try {

			// controlar campo vacio volver a preguntar
			controlador.crearFloristeria(JOptionPane.showInputDialog("Introduce el nombre del negocio"));

		} catch (CampoVacioException e) {
			System.out.println(e.getMessage());
		}

		// ------------------------------------------ CREAR ARBOLES

		while (isArbolCreado == false) {

			try {
				preguntaCrearArbol = JOptionPane.showInputDialog("¿Desea añadir un árbol? SI o NO");

				switch (preguntaCrearArbol.toLowerCase()) {
				case "si":

					try {

						controlador.crearArbol(JOptionPane.showInputDialog("Introduce el nombre del árbol"),
								Double.parseDouble(JOptionPane
										.showInputDialog("Introduce la altura (la medida de medición es en cm)")),
								Double.parseDouble(JOptionPane.showInputDialog("Introduce el precio")));

					} catch (CampoVacioException e) {
						System.out.println(e.getMessage());
						continue;

					} catch (IllegalArgumentException ex) {
						System.out.println(ex.getMessage());
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

		// ------------------------------------------------ CREAR FLORES

		while (isFlorCreada == false) {

			try {
				preguntaAnadirFlor = JOptionPane.showInputDialog("¿Desea añadir una Flor? SI o NO");

				switch (preguntaAnadirFlor.toLowerCase()) {

				case "si":
					try {
						controlador.crearFlor(JOptionPane.showInputDialog("Introduce el nombre de la flor"),
								JOptionPane.showInputDialog("Introduce el color"),
								Double.parseDouble(JOptionPane.showInputDialog("Introduce el precio")));
					} catch (CampoVacioException e) {
						System.out.println(e.getMessage());
						continue;

					} catch (IllegalArgumentException ex) {
						System.out.println(ex.getMessage());
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

		// ---------------------------------------------- CREAR DECORACION

		while (isDecoracionCreada == false) {

			try {

				preguntaAnadirDecoracion = JOptionPane.showInputDialog("¿Desea añadir una Decoración? SI o NO");

				switch (preguntaAnadirDecoracion.toLowerCase()) {
				case "si":

					try {

						controlador.crearDecoracion(JOptionPane.showInputDialog("Introduce el nombre de la decoración"),
								JOptionPane.showInputDialog("Introduce el material. Plástico o madera"),
								Double.parseDouble(JOptionPane.showInputDialog("Introduce el precio")));

					} catch (CampoVacioException e) {
						System.out.println(e.getMessage());
						continue;

					} catch (IllegalArgumentException ex) {
						JOptionPane.showMessageDialog(null,
								"Ha introducido mal el material, vuelva a introducir los datos", "Alert",
								JOptionPane.WARNING_MESSAGE);

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

//			controlador.crearDecoracion("Maceta", "Plástico", 8);
//			controlador.crearDecoracion("Florero", "Madera", 18);

		// -------------------------------------------- IMPRIMIR STOCK

		while (isStockImpreso == false) {
			try {
				pregImprimirStock = JOptionPane.showInputDialog("¿Desea imprimir el inventario? SI o NO");

				switch (pregImprimirStock.toLowerCase()) {
				case "si":
					stock = controlador.imprimirStock();
					System.out.println(stock);

					System.out.println("Hasta la proxima!");
					isStockImpreso = true;
					break;

				case "no":
					System.out.println("Hasta la proxima!");
					isStockImpreso = true;
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


	}

}
