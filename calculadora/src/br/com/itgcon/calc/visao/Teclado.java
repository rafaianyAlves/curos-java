package br.com.itgcon.calc.visao;


import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Teclado extends JPanel implements ActionListener {
        public Teclado() {
        	
        	GridBagLayout layout = new GridBagLayout();
        	GridBagConstraints c = new GridBagConstraints();
        	
        	
        	
            setLayout(layout);
            c.weightx =1;
            c.weighty =1;
            c.fill = GridBagConstraints.BOTH;
            
            //LINHA 1
            
        	adicionarBotao("RAD", Color.GRAY, c, 0, 0);
        	adicionarBotao("DEG", Color.GRAY, c, 1, 0);
        	adicionarBotao("x!", Color.GRAY, c, 2, 0);
        	adicionarBotao("(", Color.GRAY, c, 3, 0);
        	adicionarBotao(")", Color.GRAY, c, 4, 0);
        	adicionarBotao("%", Color.GRAY, c, 5, 0);
        	adicionarBotao("CE",Color.GRAY, c, 6, 0);
        	
        	//LINHA2
        	
        	adicionarBotao("lnv", Color.GRAY, c, 0, 1);
        	adicionarBotao("sin", Color.GRAY, c, 1, 1);
        	adicionarBotao("ln", Color.GRAY, c, 2, 1);
        	adicionarBotao("7",Color.LIGHT_GRAY, c, 3, 1);
        	adicionarBotao("8", Color.LIGHT_GRAY, c, 4, 1);
        	adicionarBotao("9", Color.LIGHT_GRAY, c, 5, 1);
        	adicionarBotao("/", Color.GRAY, c, 6, 1);
        	
        	//LINHA 3
        	adicionarBotao("π", Color.GRAY, c, 0, 2);
        	adicionarBotao("cos", Color.GRAY, c,1, 2);
        	adicionarBotao("log", Color.GRAY, c, 2, 2);
        	adicionarBotao("4", Color.LIGHT_GRAY, c, 3, 2);
        	adicionarBotao("5", Color.LIGHT_GRAY, c, 4, 2);
        	adicionarBotao("6", Color.LIGHT_GRAY, c, 5, 2);
        	adicionarBotao("*",Color.GRAY, c, 6, 2);
        	
        	 //LINHA 4
        	
        	adicionarBotao("e", Color.GRAY, c, 0, 3);
        	adicionarBotao("tan", Color.GRAY, c, 1, 3);
        	adicionarBotao("√", Color.GRAY, c, 2, 3);
        	adicionarBotao("1", Color.LIGHT_GRAY, c, 3, 3);
        	adicionarBotao("2", Color.LIGHT_GRAY, c, 4, 3);
        	adicionarBotao("3", Color.LIGHT_GRAY, c, 5, 3);
        	adicionarBotao("-", Color.GRAY, c, 6, 3);
        	
        	//LINHA 5
        	
        	adicionarBotao("Ans", Color.GRAY, c, 0, 4);
        	c.gridwidth =2;
        	adicionarBotao("EXP", Color.GRAY, c, 1, 4);
        	c.gridwidth =1;
        	adicionarBotao("0", Color.LIGHT_GRAY, c, 3, 4);
        	adicionarBotao(",", Color.LIGHT_GRAY, c, 4, 4);
        	adicionarBotao("=", Color.BLUE, c, 5, 4);
        	adicionarBotao("+", Color.GRAY, c, 6, 4);

		}

		private void adicionarBotao(String texto, Color cor, GridBagConstraints c, int x, int y) {
			
			c.gridx = x;
			c.gridy = y;
			Botao botao = new Botao(texto, cor);
			botao.addActionListener(this);
			add(botao,c);
		}
		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() instanceof JButton	 ) {
			JButton botao = (JButton) e.getSource();	       
		    System.out.println(botao.getText());
			}
		}
}
