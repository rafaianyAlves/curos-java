package Excecao;

public class Basico {
	public static void main(String[] args) {
		
		Aluno a1 = null;
		try {
			imprimirNomeDoAluno(a1);
		} catch(Exception execao) {
					System.out.println("ocorreu ");
				}
				try {
					System.out.println(7/0);
				} catch(ArithmeticException e) {
					System.out.println(" ocorreu" + e.getMessage());
				}
		System.out.println("fim");
	}	
		 public static void imprimirNomeDoAluno(Aluno aluno) {
			 System.out.println(aluno.nome);
		 }
	

}
