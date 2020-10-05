package padroes.observer;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Porteiro {
	private List<ChegadaAniversarianteObservador> observadores = new ArrayList<>();
	
	public void registrarObservador(ChegadaAniversarianteObservador o) {
		observadores.add(o);
		
	}
	public void monitorar() {
		
		Scanner entrada = new Scanner(System.in);
		String valor = "" ;
		while(!"Sair".equalsIgnoreCase(valor)) { // ignorar se a letra é maiucsula ou minuscula
			System.out.println("Ele chegou?");
			valor = entrada.nextLine();
			
			if("sim".equalsIgnoreCase(valor)) {
				// criar evento
				ChegadaAniversarianteEvento evento = new ChegadaAniversarianteEvento(new Date());
				
				//notificar os observadores
				observadores.stream().forEach(o -> o.chegou(evento));
				valor = "sair";
				
			} else {
				System.out.println("Alarme falso!");
			}
		}
		
		entrada.close();
	}

}
