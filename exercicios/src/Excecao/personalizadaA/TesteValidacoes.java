package Excecao.personalizadaA;

import Excecao.Aluno;
import Excecao.personalizadaB.NumeroNegativoException;
import Excecao.personalizadaB.StringVaziaException;

public class TesteValidacoes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Aluno aluno = new Aluno("", -7);
			Validar.aluno(aluno);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
//		} catch (StringVaziaException e) {
//			System.out.println(e.getMessage());
//		} catch(NumeronegativoException e) {
//			System.out.println(e.getMessage());
		}
		
		System.out.println("Fim");
		

	}

}
