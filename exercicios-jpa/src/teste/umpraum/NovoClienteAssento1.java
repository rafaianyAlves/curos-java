package teste.umpraum;

import infra.DAO;
import modelo.umpraum.Assento;
import modelo.umpraum.Cliente;

public class NovoClienteAssento1 {
	public static void main(String[] args) {
		Assento assento = new Assento("4A");
		Cliente cliente = new Cliente("Evilyn", assento);
		
	         DAO<Cliente> dao = new DAO<>(Cliente.class);
	         dao.incluirAtomico(cliente);
	     
	     // com uma anotação consegue colocar em cascata, noa precisa gerar inserções, selects e afins
	}
	

}
