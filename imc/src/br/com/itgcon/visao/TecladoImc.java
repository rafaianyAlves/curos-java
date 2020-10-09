package br.com.itgcon.visao;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

import br.com.itgcon.modelo.ImcMemoria;

@SuppressWarnings("serial")
public class TecladoImc extends JPanel implements ActionListener{
	
	public TecladoImc() {
		GridBagLayout layout = new GridBagLayout();
		GridBagConstraints c= new GridBagConstraints();	
		
		setLayout(layout);
		c.weightx =1;
		c.weighty = 1;
		
		c.fill =GridBagConstraints.BOTH;
		

        c.gridwidth = 1;
		adicionarBotao("7", Color.PINK, c, 0, 0);
		adicionarBotao("8", Color.PINK, c, 1, 0);
		adicionarBotao("9", Color.PINK, c, 2, 0);
		adicionarBotao("KG", Color.PINK, c, 3, 0);
		
		 c.gridwidth = 1;
		adicionarBotao("4", Color.PINK, c, 0, 1);
		adicionarBotao("5", Color.PINK, c, 1, 1);
		adicionarBotao("6", Color.PINK, c, 2, 1);
		adicionarBotao("m", Color.PINK, c, 3, 1);
		
		 c.gridwidth = 1;		
		adicionarBotao("1", Color.PINK, c, 0, 2);
		adicionarBotao("2", Color.PINK, c, 1, 2);
		adicionarBotao("3", Color.PINK, c, 2, 2);
		adicionarBotao("IMC", Color.PINK, c, 3, 2);
		
		 
		c.gridwidth = 1;
		adicionarBotao("0", Color.PINK, c, 0, 3);
		adicionarBotao(",", Color.PINK, c, 1, 3);
		adicionarBotao("=", Color.PINK, c, 2, 3);
		adicionarBotao("CE", Color.PINK, c,3, 3);
	
		
	}
	private void adicionarBotao(String texto, Color cor, GridBagConstraints c , int x ,int y) {
		
		c.gridx =x;
		c.gridy =y;
		BotaoImc botao = new BotaoImc(texto, cor);
		botao.addActionListener(this);
		add(botao,c);
		
	} @Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() instanceof JButton ) {
			JButton botao = (JButton) e.getSource();
			ImcMemoria.getInstancia().processarComando(botao.getText());
		}
	}

}
