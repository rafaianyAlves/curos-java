package Streams;

import java.util.function.Consumer;
import java.util.stream.Stream;

public class CriandoStreams {

	public static void main(String[] args) {
		
		 Consumer<Object> print = System.out::print;
		 Stream<String> langs = Stream.of("Java ", "HTML \n "); // stream.of é metodo estatico
		 langs.forEachOrdered(print);
		 
		 String[] maisLangs = {"Phyton ","C++ "};
		 Stream.of(maisLangs).forEach(print);
		 
		 // Stream.iterate(0, n -> n+1).forEach(print); // gera de forma infinita, mas com uma forma ja pre-determinada
		
		 // Stream.generate(() -> "a").forEach(print); // gera de forma infinita o valor "a" e sem ordenação
	}

}
