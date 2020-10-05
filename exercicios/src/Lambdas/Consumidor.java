package Lambdas;

import java.util.function.Consumer;
import java.util.List;
import java.util.Arrays;


public class Consumidor {
	public static void main(String[] args) {
		
		Consumer<Produto> imprimir = p -> System.out.println(p.nome);
		
		Produto p1 = new Produto("Caneta", 12.43, 0.09);
		imprimir.accept(p1);
		
		Produto p2= new Produto("Notebook",5000.87, 0.29);
		Produto p3= new Produto("Tablet", 500.0, 0.15);
		Produto p4 = new Produto("Lapiseira", 50.43, 0.10);
		Produto p5 = new Produto("Compasso", 159.60, 0.15);
		List<Produto> produtos = Arrays.asList(p1 ,p2, p3, p4, p5);
		
		produtos.forEach(imprimir);
		produtos.forEach(p -> System.out.println(p.preco));
		produtos.forEach(System.out::println);
	}

}
