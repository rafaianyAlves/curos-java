package Lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class Fornecedor {

	public static void main(String[] args) {
		Supplier< List<String> > umaLista = () -> Arrays.asList( "RAFA", "JU", "EVY");
		System.out.println(umaLista.get());
	// supplier é um tipo de interface funcional que nao recebe nenhum parametro por isso () -> vazia
	}

}
