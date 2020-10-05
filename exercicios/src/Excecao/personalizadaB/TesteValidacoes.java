package Excecao.personalizadaB;

import Excecao.Aluno;

public class TesteValidacoes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Aluno aluno = new Aluno("", -7);
			Validar.aluno(aluno);
	
		
		} catch (StringVaziaException e) {
			System.out.println(e.getMessage());
		} catch(NumeroNegativoException 
				| IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
	
		
		System.out.println("Fim");
		

	}

}
