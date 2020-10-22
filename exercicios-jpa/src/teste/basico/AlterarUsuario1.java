package teste.basico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.basico.Usuario;

public class AlterarUsuario1 {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exercicios-jpa");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		Usuario usuario = em.find(Usuario.class, 2L);
        usuario.setEmail("anna.beatriz@itgcon.com.br");
        usuario.setNome("Anna Beatriz");
		
		em.merge(usuario);
		em.getTransaction().commit();
		emf.close();
		em.close();

	}

}
