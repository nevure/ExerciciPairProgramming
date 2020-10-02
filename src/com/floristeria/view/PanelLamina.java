package com.floristeria.view;

import javax.swing.*;

public class PanelLamina extends JPanel {

	public PanelLamina() {

		JLabel texto1 = new JLabel(
				"Si desea imprimir el inventario, pulse el bot�n \"IMPRIMIR\". Para salir haga click en la X para cerrar la ventana");

		add(texto1);

		//Crear bot�n para imprimir
		JButton botonCrear = new JButton("IMPRIMIR");

		//ActionListener-actionperformed
		MainApp mi_evento = new MainApp();

		//Bot�n a la escucha
		botonCrear.addActionListener(mi_evento);

		//Agregar bot�n a la lamina
		add(botonCrear);

	}

}