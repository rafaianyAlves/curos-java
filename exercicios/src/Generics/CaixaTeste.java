package Generics;

public class CaixaTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Caixa <String> caixaA = new Caixa<>();
		caixaA.guardar("oi");
		System.out.println(caixaA.abrir());
		 // basta mudar em um local para mudar de Integer, Double, String,Long e assim por diante
        
	}

}
