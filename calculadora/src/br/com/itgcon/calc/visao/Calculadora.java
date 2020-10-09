package br.com.itgcon.calc.visao;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class Calculadora extends JFrame {
	public Calculadora() {
		
		organizarLayout();
		
		setTitle("Calculadora");
		setSize(600,300);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setVisible(true);
		
	}
	
	
        private void organizarLayout() {
		setLayout(new BorderLayout());
		
		Display display = new Display();
		display.setPreferredSize(new Dimension(300, 60)); 
		add(display, BorderLayout.NORTH);
		
		Teclado teclado = new Teclado();
		add(teclado, BorderLayout.CENTER);
	}


		public static void main(String[] args) {
			new Calculadora(); //chama o construtor calculadora
		}
}
