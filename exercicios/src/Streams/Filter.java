package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Filter {
	public static void main(String[] args) {
		Aluno a1 = new Aluno("Mara", 7.0, false);
		Aluno a2 = new Aluno("Ju", 8.5, true);
		Aluno a3 = new Aluno("Let", 7.5, true);
		Aluno a4 = new Aluno("Math", 7.5, false);
		
		List<Aluno> aluno =Arrays.asList(a1,a2,a3,a4);
		Predicate<Aluno> aprovado = a-> a.nota >=7;
		Predicate<Aluno> bomComportamento = a-> a.bomComportamento;
		Function<Aluno, String> saudacaoAprovado = a-> "Parabens " + a.nome + " ! Voce foi aprovado (a)";
		
	     aluno.stream()
	    .filter(aprovado)
	    .filter(bomComportamento)
	    .map(saudacaoAprovado)
	    .forEach(System.out::println);
		
	}

}
