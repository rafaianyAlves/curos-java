package Generics;

public class Caixa<O> {
	
	private O coisa;
	
	public void guardar(O coisa) {
		this.coisa = coisa;
	}

	public O abrir() {
		return coisa;
	}

}
