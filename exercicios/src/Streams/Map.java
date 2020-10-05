package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class Map {
	
	public static void main(String[] args) {
		
		Consumer<String> print = System.out::print;
		
		List<String> marcas = Arrays.asList("bmw" , " \nferrari" , " \nhonda ");
		marcas.stream().map(m -> m.toUpperCase()).forEach(print);
		
		UnaryOperator<String> maiuscula = n-> n.toUpperCase();
		UnaryOperator<String> primeiraLetra= n-> n.charAt(0) + "";
		UnaryOperator<String> grito = n-> n + "!!!";
		
		//maiuscula.andThen(primeiraLetra).andThen(grito).apply("bmw");	
		System.out.println("\nUsando composicao... ");
		marcas.stream().map(maiuscula).forEach(print);
		marcas.stream().map(maiuscula).map(primeiraLetra).forEach(print);
		marcas.stream().map(maiuscula).map(grito).forEach(print);
		
}

}