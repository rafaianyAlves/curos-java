package ClassesExercicios;

import java.util.Scanner;

/**
 * 9. Crie uma classe TrocaNumero que contenha um m�todo que receba dois
 * n�meros, NumA e NumB ( nessa ordem ), e imprima na ordem inversa, isto �, se
 * NumA = 5 e NumB = 10, por exemplo, devem ser impressos na ordem NumA = 10 e
 * NumB = 5.
 */
public class Exercicio9 {

	public static void inversao(int a, int b) {
		int reserva = a;
		a = b;
		b = reserva;
		System.out.printf("\n\nAgora seu numA �: %d", a);
		System.out.printf("\nAgora seu numB �: %d", b);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite o numA: ");
		int numA = scanner.nextInt();

		System.out.printf("\nSeu numA �: %d", numA);

		System.out.println("\n\nDigite o numB: ");
		int numB = scanner.nextInt();

		System.out.printf("\nSeu numB �: %d", numB);

		inversao(numA, numB);

		scanner.close();
	}

}