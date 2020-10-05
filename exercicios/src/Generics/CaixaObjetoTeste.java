package Generics;

public class CaixaObjetoTeste {
	public static void main(String[] args) {
		CaixaObjeto caixaA = new CaixaObjeto();
		caixaA.guardar(2.3);// double -> Double
		
		Double coisa = (Double)caixaA.abrir(); // tipo correto e depois o cast ( por isso aparece Double e especificado em Double também)
		System.out.println(coisa);
		
		
		}
	// sem os tipos genericos

}
