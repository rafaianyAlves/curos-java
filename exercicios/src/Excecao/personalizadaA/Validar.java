package Excecao.personalizadaA;

import Excecao.Aluno;

public class Validar {
           private void validar() {}
           
           public static void aluno(Aluno aluno) {
        	   if(aluno == null) {
        		   throw new IllegalArgumentException("O aluno esta nulo");
    	   }
   	   if(aluno.nome == null || aluno.nome.trim().isEmpty()) {
   		   throw new StringVaziaException("nome");
   	   }
 	   if(aluno.nota < 0 || aluno.nota >10) {
        		   throw new NumeroNegativoException("nota");
        	   }
           }
 

}
