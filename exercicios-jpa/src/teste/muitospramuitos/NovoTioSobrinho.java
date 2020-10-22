package teste.muitospramuitos;

import infra.DAO;
import modelo.muitospramuitos.Sobrinho;
import modelo.muitospramuitos.Tio;

public class NovoTioSobrinho {
	public static void main(String[] args) {
		
		
		
		Tio tio1 = new Tio("Suru");
		Tio tia2 = new Tio("Suzana");
		
		Sobrinho sobrinha1 = new Sobrinho("Rafinha");
		Sobrinho sobrinha2 = new Sobrinho("Maju");
		
		tio1.getSobrinhos().add(sobrinha2);
		sobrinha2.getTios().add(tio1);
		
		tia2.getSobrinhos().add(sobrinha1);
		sobrinha1.getTios().add(tia2);
		
		tio1.getSobrinhos().add(sobrinha1);
		sobrinha1.getTios().add(tio1);
		
		tia2.getSobrinhos().add(sobrinha2);
		sobrinha2.getTios().add(tia2);
		
		DAO<Object> dao = new DAO<>();
		dao.abrirT()
		.incluirT(tio1)
		.incluirT(tia2)
		.incluirT(sobrinha2)
		.incluirT(sobrinha1)
		.fecharT()
		.fechar();
		
	}

}
