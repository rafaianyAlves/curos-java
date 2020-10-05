package EstruturasDeControleDesafios;
import java.util.Scanner;
public class Desafio2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Diite o ano: ");
		int ano = scanner.nextInt();
		
		int bissexto = ano % 4;
		if(bissexto == 0) {
			System.out.println(ano + " Ano é bissexto");
		} else {
			System.out.println(ano + " Ano nao é bissexto");
		}
		
		
		
		scanner.close();

	}

}
