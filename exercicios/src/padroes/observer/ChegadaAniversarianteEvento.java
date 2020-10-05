package padroes.observer;

import java.util.Date;

public class ChegadaAniversarianteEvento {
	
	private final Date horaDaChegada;

	public ChegadaAniversarianteEvento(Date horaDaChegada) {
		
		this.horaDaChegada = horaDaChegada;
	}

	public Date getHoraDaChegada() {
		return horaDaChegada;
	}
}
