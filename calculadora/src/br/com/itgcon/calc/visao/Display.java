package br.com.itgcon.calc.visao;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JLabel;


import javax.swing.JPanel;

import br.com.itgcon.calc.modelo.Memoria;

@SuppressWarnings("serial")
public class Display extends JPanel {

	//JLabel é o texto que vai estar contido na aplicação
	private final JLabel  label;
	
	public Display() {
		setBackground(new Color(209,198,191));
		label = new JLabel(Memoria.getInstancia().getTextoAtual());
		label.setForeground(Color.WHITE);
		label.setFont(new Font("courier", Font.PLAIN, 30));
		
		
		setLayout(new FlowLayout(FlowLayout.RIGHT,10,25));
        add(label);
	}

}
