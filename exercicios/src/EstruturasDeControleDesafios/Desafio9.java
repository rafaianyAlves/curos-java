package EstruturasDeControleDesafios;
import java.util.Scanner;

public class Desafio9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);

		int somadorDeNumeros = 0;
		int numero = 0;
		
		while(numero >= 0) {
			System.out.println("Digite um numero inteiro (zero ou negativo para sair): ");
			numero = entrada.nextInt();
			if (numero >= 0) {
				somadorDeNumeros += numero; // Isso é igual a somadorDeNumeros = somadorDeNumeros + numero;
				System.out.printf("\nSoma até o momento: %d\n", somadorDeNumeros);
			}
		}

		entrada.close();



	}

}
