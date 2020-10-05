package Swing;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Observador {
 // introduzir a parte de interface gráfica
	public static void main(String[] args) {
		// JFrame é equivalente a uma janela (tela da aplicação)
		JFrame janela = new JFrame("Observador");
		janela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // qual operação padrao para fechar a janela e recebe int
        janela.setSize(300,300); // redimensionar o tamanho da janela que abrir
        janela.setLayout(new FlowLayout()); 
        janela.setLocationRelativeTo(null); //centralizar na tela!
        
        
        
        JButton botao = new JButton("Clicar"); // add botao para clicar
        janela.add(botao); // quando colocado vai aparecer na aplicação
        botao.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Evento ocorreu!!");
				
			}
		});
        //temos que analisar se a interface envolvida é funcional ou não
  
		janela.setVisible(true); // faz a janela abrir		
	}

}
