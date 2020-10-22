package teste.basico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.basico.Usuario;

public class AlterarUsuario3 {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exercicios-jpa");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		Usuario usuario = em.find(Usuario.class, 2L);
		em.detach(usuario); // aqui desassociou o usuario, por isso quando ele roda o programa não altera
        usuario.setEmail("anna.beatriz@itgcon.com.br");
        usuario.setNome("Anna Beatriz");
		
		// em.merge(usuario);
		em.getTransaction().commit();
		emf.close();
		em.close();

	}

}
