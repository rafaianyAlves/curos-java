package teste.umpraum;

import infra.DAO;
import modelo.umpraum.Assento;
import modelo.umpraum.Cliente;

public class NovoClienteAssento2 {
	public static void main(String[] args) {
		Assento assento = new Assento("23F");
		Cliente cliente = new Cliente("Rafa", assento);
	         DAO<Object> dao = new DAO<>();
	       dao.abrirT()
	       .incluirT(assento)
	       .incluirT(cliente)
	       .fecharT()
	       .fechar();
	}
	

}
