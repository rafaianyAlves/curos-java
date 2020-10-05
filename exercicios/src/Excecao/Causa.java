package Excecao;

public class Causa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 try {
			metodoA(null);
		} catch (IllegalArgumentException e) {
			if(e.getCause() != null) {
				System.out.println(e.getCause().getMessage());
			}
						
		}
		// metodoA(null);

	}
	static void metodoA (Aluno aluno) {
		try {
			metodoB(aluno);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			throw new IllegalArgumentException(e);
		}
		
	}
	static void metodoB (Aluno aluno) {
		if(aluno == null) {
			throw new NullPointerException("ALUNO ESTA NULO!!!!!");
		}
		System.out.println(aluno.nome);
	}

}
