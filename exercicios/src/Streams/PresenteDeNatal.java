package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class PresenteDeNatal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Filhas f1 = new Filhas("Rafa",false, 9.5);
		Filhas f2 = new Filhas("Evy",false, 8.5);
		Filhas f3= new Filhas("Maju,",true, 7.5);
		Filhas f4 = new Filhas("Vivi,",true, 7.5);
		
		List<Filhas> filhas = Arrays.asList(f1,f2,f3,f4);
		Predicate<Filhas> passouDeAno = f -> f.nota >=7;
		Predicate<Filhas> vaiGanharPresente = f -> f.vaiGanharPresente;
		Function<Filhas, String> ganhouPresente = f -> " Parabens " + f.nome + " você pode escolher o que quer ganhar!";
		
		filhas.stream()
		.filter(passouDeAno)
		.filter(vaiGanharPresente)
		.map(ganhouPresente)
		.forEach(System.out::println);
		
		

	}

}
