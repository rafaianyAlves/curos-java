package ClassesExercicios;

import java.util.Scanner;

/**
 * 10. Crie uma classe ComparaNumero que contenha um m�todo que receba dois
 * n�meros e indique se s�o iguais ou se s�o diferentes. Mostre o maior n�mero e
 * o menor n�mero ( nesta sequ�ncia ).
 */
public class Exercicio10 {

	public static void compara(int a, int b) {
		if (a == b) {
			System.out.printf("O numero " + a + " � igual ao numero " + b);
		} else if (a > b) {
			System.out.printf("\nO numero " + a + " � o maior numero");
			System.out.printf("\nO numero " + b + " � o menor numero");
		} else {
			System.out.printf("\nO numero " + b + " � o maior numero");
			System.out.printf("\nO numero " + a + " � o menor numero");
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite o primeiro numero: ");
		int num1 = scanner.nextInt();

		System.out.println("Digite o segundo numero: ");
		int num2 = scanner.nextInt();

		compara(num1, num2);

		scanner.close();
	}

}