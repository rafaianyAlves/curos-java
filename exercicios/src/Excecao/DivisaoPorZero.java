package Excecao;

public class DivisaoPorZero {
	
		public static void main (String args []) {
		try {
		int d=0;
		int a=42/d;
		 System.out.println ("Dentro do bloco da exce��o.");
		}
		catch (ArithmeticException e) {
		System.out.println ("Aconteceu divis�o por zero.");
		}
		System.out.println ("Execu��o continua.");
		}
		}


