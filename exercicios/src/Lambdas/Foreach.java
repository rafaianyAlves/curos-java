package Lambdas;

import java.util.Arrays;
import java.util.List;

public class Foreach {
	public static void main(String[] args) {
		List<String> aprovados = Arrays.asList("ANA", "LIA","BIA");
	
		System.out.println("Forma tradicional ... " );
		for(String nome: aprovados) {
			System.out.println(nome);
		}
		System.out.println("\nForEach .... ");
		
		aprovados.forEach((nome)-> {System.out.println(nome + "!!!");});
		
		System.out.println("\nMetthod Reference ...");
		aprovados.forEach(System.out::println );
		
         System.out.println("\nForEach 2.... ");
		aprovados.forEach((nome)-> meuImprimir(nome));
		
		System.out.println("\nMetthod Reference 2 ...");
		aprovados.forEach(Foreach::meuImprimir);
		
	}
	//:: (passa a referencia)
        static void meuImprimir (String nome) {
        	System.out.println("Oi meu nome é " + nome + " !!");
        }

}
