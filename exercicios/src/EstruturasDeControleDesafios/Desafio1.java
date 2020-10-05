package EstruturasDeControleDesafios;
import java.util.Scanner;
public class Desafio1 {
             public static void main(String[] args) {
            	 
            	 Scanner entrada = new Scanner(System.in);

         		System.out.println("Digite o numero: ");
         		int numero = entrada.nextInt();
         		
         	
         			if (numero >= 0 && numero <= 10) {
         				if (numero % 2 == 0) {
         					System.out.println("O numero " + numero + " está entre 0 e 10 e é um par.");
         				} else {
         					System.out.println("O numero " + numero + " está entre 0 e 10 mas não é um par.");
         				}
         			} else {
         				System.out.println("O numero " + numero + " não está entre 0 e 10.");
         			}

         		entrada.close();


			}
}
