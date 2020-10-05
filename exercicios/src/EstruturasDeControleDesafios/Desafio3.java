package EstruturasDeControleDesafios;
import java.util.Scanner;
public class Desafio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
        System.out.println("Digite a nota1: ");
       double nota1 = entrada.nextDouble();
        
        System.out.println("Digite nota2: ");
       double nota2 = entrada.nextDouble();
       double media = (nota1 + nota2)/ 2;
       
       
       
         if(media >= 7.0) {
        	 System.out.println("Aprovado");
        	 
         } else if(media  >= 4.0) {
        	 System.out.println("Recuperaçao");
        	 
         } else {
        	 System.out.println("Reprovado");
         }

		entrada.close();



	}

}
