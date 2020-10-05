package Lambdas;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class OperadorBinario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryOperator<Double> media = (Double n1, Double n2) -> (n1+n2) /2;
		System.out.println(media.apply(9.8, 5.5));
		
		BiFunction<Double, Double, String> resultado = (n1,n2) -> {
			double notaFinal = (n1 +n2) / 2;
			return notaFinal >= 7? "Aprovado" : "Reprovado";
		};
		
		System.out.println(resultado.apply(9.0, 5.0));
		
		Function<Double, String> conceito = m -> m >= 7 ? "Aprovado" : "Reprovado";
		
	System.out.println(media.andThen(conceito).apply(9.7, 4.1));

	}

}
