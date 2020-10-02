package com.floristeria.view;

import javax.swing.*;

public class PanelLamina extends JPanel {

	public PanelLamina() {

		JLabel texto1 = new JLabel(
				"Si desea imprimir el inventario, pulse el botón \"IMPRIMIR\". Para salir haga click en la X para cerrar la ventana");

		add(texto1);

		//Crear botón para imprimir
		JButton botonCrear = new JButton("IMPRIMIR");

		//ActionListener-actionperformed
		MainApp mi_evento = new MainApp();

		//Botón a la escucha
		botonCrear.addActionListener(mi_evento);

		//Agregar botón a la lamina
		add(botonCrear);

	}

}