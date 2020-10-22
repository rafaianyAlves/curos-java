package teste.muitospramuitos;

import modelo.muitospramuitos.Filme;
import infra.DAO;
import modelo.muitospramuitos.Ator;


public class NovoFilmeAtor {

	public static void main(String[] args) {
		
		Filme filmeA = new Filme("Harry Potter e as Relíquias da Morte",10.0);
		Filme filmeB = new Filme("A bela e a fera", 9.9);
		
		Ator atrizA = new Ator("Emma Watson");
		Ator atorB = new Ator("Daniel Radcliffe");
		
		filmeA.adicionarAtor(atrizA);
		filmeA.adicionarAtor(atorB);
		
		
		DAO<Filme> dao = new DAO<Filme>();
		dao.incluirAtomico(filmeA);
		
		
		// quando inserir o filmeA ira em cascata inserir a atriz e o ator, e inserir os filmes que estiverem vinculados a um dos dois
      // dao.fechar();
	}

}
