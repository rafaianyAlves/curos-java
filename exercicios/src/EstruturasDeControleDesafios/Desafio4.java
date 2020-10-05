package EstruturasDeControleDesafios;
import java.util.Scanner;
public class Desafio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int numero = entrada.nextInt();
        
        int contadorDeDivisores = 0;
		for(int i = 2; i < numero; i++ ) {
        	if(numero % i == 0) {
        		contadorDeDivisores++;
        	}
        	
        }
		if(contadorDeDivisores == 0) {
			System.out.println("O numero " + numero + " é primo");
		} else {
			System.out.println("O numero " + numero + " nao é primo");
		}

		entrada.close();


	}

}
