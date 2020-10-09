package br.com.itgcon.visao;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class ImcPrincipal extends JFrame {
	public ImcPrincipal() {
		
		
		organizarLayout();
		
		setTitle("IMC");
		setSize(300,600);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setVisible(true);
	}

	private void organizarLayout() {
		setLayout(new BorderLayout());
		
		DisplayImc display = new DisplayImc();
		display.setPreferredSize(new Dimension(300,60));
		add(display, BorderLayout.CENTER);
		
	}
	public static void main(String[] args) {
		new ImcPrincipal();
	}

}
