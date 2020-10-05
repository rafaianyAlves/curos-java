package Lambdas;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Desafio {

	public static void main(String[] args) {	
		
		Function<Produto, Double> precoFinal = produto -> 
		produto.preco * (1- produto.desconto);
		
		UnaryOperator<Double> impostoMunicipal = preco -> 
		preco >=2500 ? preco * 1.085 : preco;
		
		UnaryOperator<Double> frete = preco ->preco
				>= 3000 ? preco + 100 : preco +50;
				
		UnaryOperator<Double> arredondar = preco -> 
		Double.parseDouble(String.format("%.2f", preco));
		
		Function<Double, String> formatar =  preco ->
		("R$" + preco).replace(".", ",");
		
	    Produto p1 =  new Produto("iPad",3225.89,0.13);
	    String preco = precoFinal
	    		.andThen(impostoMunicipal)
	    		.andThen(frete)
	    		.andThen(arredondar)
	    		.andThen(formatar)
	    		.apply(p1);
	    
		System.out.println(" O preco final é " + preco);
		
		
		//não esta funcionando
		
	
		
		
	}

}
