package Lambdas;

import java.util.function.Function;


public class Funcao {

	public static void main(String[] args) {
		Function<Integer, String> parOuImpar = num -> num %2 == 0? "Par": "Impar";
	//System.out.println(parOuImpar.apply(0));
		
		Function<String, String> oResultadoE = valor -> "O resultado é " + valor;
		// STRING SAI OUTRA STRING
		Function<String, String> empolgado = valor -> valor +"!!!";
		
		String resultadoFinal = parOuImpar.andThen(oResultadoE).andThen(empolgado).apply(11); //composicao de funcoes\n
		// ou seja uma encadeiando depois da outra pra dar o resultado necessario
		System.out.println(resultadoFinal); // uma verdadeira magica
		
		
	}

}
