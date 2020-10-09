package br.com.itgcon.visao;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

import br.com.itgcon.modelo.ImcMemoria;
import br.com.itgcon.modelo.ImcMemoriaObservador;

@SuppressWarnings("serial")
public class DisplayImc extends JPanel implements ImcMemoriaObservador{
	
	private final JLabel label;
	
	public DisplayImc() {
		ImcMemoria.getInstancia().adicionarObservador(this);		
		
		setBackground(new Color(242,98,121));
		label = new JLabel(ImcMemoria.getInstancia().getTextoAtual());
		label.setForeground(Color.WHITE);
		label.setFont("courier", Font.PLAIN,25);
		
		
		setLayout(new FlowLayout(FlowLayout.RIGHT,10,25));
        add(label);
	} @Override
	
	public void valorAlterado(String novoValor) {
		label.setText(novoValor);
	}
	

}
