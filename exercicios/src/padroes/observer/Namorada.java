package padroes.observer;

public class Namorada implements ChegadaAniversarianteObservador {
	public void chegou(ChegadaAniversarianteEvento evento) {
		
		System.out.println("Avisar os convidados");
		System.out.println("Apagar as luzes");
		System.out.println("Esperar um pouco");
		System.out.println("Surpresa!!!!");
	}

}
