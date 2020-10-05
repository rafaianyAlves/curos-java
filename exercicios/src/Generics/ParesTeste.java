package Generics;

public class ParesTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pares<Integer, String> resultadoConcurso = new Pares<>();
		
		resultadoConcurso.adicionar(1, "Rafaiany");
		resultadoConcurso.adicionar(2, "Evilyn");
		resultadoConcurso.adicionar(3, "Maria");
		resultadoConcurso.adicionar(4, "Joyce");
		resultadoConcurso.adicionar(6, "Agatha");
		
		System.out.println(resultadoConcurso.getValor(1));
		System.out.println(resultadoConcurso.getValor(2));
		System.out.println(resultadoConcurso.getValor(4));
		System.out.println(resultadoConcurso.getValor(3));
//      o resultado quando se repete não aceita, ele vai substituir sempre o ultimo \n
//		que add
		

	}

}
