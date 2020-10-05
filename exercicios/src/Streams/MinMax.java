package Streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MinMax {

	public static void main(String[] args) {
		Aluno a1 = new Aluno("Jose" , 7.1);
		Aluno a2 = new Aluno("Marcia",9.1);
		Aluno a3 = new Aluno("Esli" ,6.1);
		Aluno a4 = new Aluno("Cido" ,5.5);
		Aluno a5 = new Aluno("Karol",5.0);
		
		List<Aluno> alunos = Arrays.asList(a1,a2,a3,a4,a5);
		Comparator<Aluno> melhorNota = (aluno1,aluno2) -> {
			if(aluno1.nota > aluno2.nota) return 1;
			if(aluno1.nota < aluno2.nota) return -1;
			return 0;
		};
		System.out.println(alunos.stream().max(melhorNota).get()); // melhor nota
		System.out.println(alunos.stream().min(melhorNota).get()); // pior nota da turma
	}

}
