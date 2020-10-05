package Generics;

public class CaixaNumeroTeste {

	public static void main(String[] args) {
		CaixaNumero<Integer> caixaA = new CaixaNumero();
		caixaA.guardar(3);
		System.out.println(caixaA.abrir());
		// só pode ser o tipo de classe apresentada nos generics que foi tipo NUMBER
	}

}
