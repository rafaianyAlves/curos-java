package CursoJavaCLoiane;

import java.util.Scanner;

public class AgendaTeste {

	public static void main(String[] args) {
	    Scanner entrada = new Scanner(System.in);
	    
	    System.out.println("Entre com nome da agenda " );
	    String nome = entrada.nextLine();
	    
	
		Agenda agenda = new Agenda();
		Contato[] contatos = new Contato[2];
	for (int i = 0; i < 2; i++) {
		System.out.println("Entre  com as informacoes do contato " + (i+1));
		Contato c = new Contato();
		
		System.out.println("Entre com nome da agenda " );
		String nome1 = entrada.nextLine();
		c.setNome(nome1);
		
		System.out.println("Entre com telefone da agenda " );
		String telefone = entrada.nextLine();
        c.setTelefone(telefone);
		
		System.out.println("Entre com email da agenda " );
		String email = entrada.nextLine();
		c.setEmail(email);
		 contatos[i] = c;
		
	}
		agenda.setContatos(contatos);
		
		System.out.println(agenda.obterInfo());
		entrada.close();

	}

}
