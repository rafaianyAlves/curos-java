package br.com.itgcon.cm;

import br.com.itgcon.cm.modelo.Tabuleiro;
import br.com.itgcon.cm.visao.TabuleiroConsole;

public class Aplicacao {

	public static void main(String[] args) {
		
	Tabuleiro tabuleiro = new Tabuleiro(6, 6, 3);
	new TabuleiroConsole(tabuleiro);
	
	
	}

}
