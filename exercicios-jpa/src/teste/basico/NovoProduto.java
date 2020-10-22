package teste.basico;

import infra.DAO;
import modelo.basico.Produto;
public class NovoProduto {

	public static void main(String[] args) {
		Produto produto = new Produto("Caneta", 1.0);
        
        DAO<Produto> dao = new DAO<>(Produto.class);
        dao.abrirT().incluirT(produto).fecharT();
       
        System.out.println("ID do produto" + produto.getNome());

	}

}
