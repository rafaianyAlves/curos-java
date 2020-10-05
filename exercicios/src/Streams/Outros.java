package Streams;

import java.util.Arrays;
import java.util.List;

public class Outros {
	public static void main(String[] args) {
		Aluno a1 = new Aluno("Jose" , 7.1);
		Aluno a2 = new Aluno("Marcia",9.1);
		Aluno a3 = new Aluno("Esli" ,6.1);
		Aluno a4 = new Aluno("Cido" ,5.5);
		Aluno a5 = new Aluno("Karol",5.0);
		Aluno a6 = new Aluno("Maju" , 7.1);
		Aluno a7 = new Aluno("Vitoria",9.1);
		Aluno a8 = new Aluno("Rafa" ,6.1);
		Aluno a9 = new Aluno("Lucia" ,5.5);
		Aluno a10 = new Aluno("Ana",5.0);
		
		List<Aluno> alunos = Arrays.asList(a1,a2,a3,a4,a5,a6,a7,a8,a9,a10);
		
		System.out.println("distinct ...");
		alunos.stream()
		.distinct()
		.forEach(System.out::println);
		

		System.out.println("\n skip/ limit"); // skip pulou determinados elementos e limit é limitei os que eu queria...
		alunos.stream()
		.distinct()
		.skip(4)
		.limit(4)
		.forEach(System.out::println);
		
		
		System.out.println("\ntakeWhile"); // pegue elementos enquanto acontece uma determinada condicao
		alunos.stream()
		.distinct()
		.skip(1)
		.takeWhile(a -> a.nota >= 6)
		.forEach(System.out::println);
		
		
		
		
	}

}
