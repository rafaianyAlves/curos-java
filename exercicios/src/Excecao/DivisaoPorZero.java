package Excecao;

public class DivisaoPorZero {
	
		public static void main (String args []) {
		try {
		int d=0;
		int a=42/d;
		 System.out.println ("Dentro do bloco da exceção.");
		}
		catch (ArithmeticException e) {
		System.out.println ("Aconteceu divisão por zero.");
		}
		System.out.println ("Execução continua.");
		}
		}


