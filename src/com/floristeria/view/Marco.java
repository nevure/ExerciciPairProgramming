package com.floristeria.view;

import javax.swing.JFrame;

public class Marco extends JFrame {

	public Marco() {

		setTitle("Inventario");

		setBounds(600, 350, 700, 150);

		PanelLamina lamina = new PanelLamina();

		//Agregar la lamina al marco
		add(lamina);

	}

}