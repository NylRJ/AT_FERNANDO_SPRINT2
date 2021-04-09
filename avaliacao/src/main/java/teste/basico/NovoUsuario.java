package teste.basico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.i9developement.school.avaliacao.entity.basico.Usuario;

public class NovoUsuario {
	
		public static void main(String[] args) {
			
			EntityManagerFactory emf = Persistence.
					createEntityManagerFactory("lojatest");
			EntityManager em  = emf.createEntityManager();
			
			Usuario novoUsuario = new Usuario("Djalma", "djalma@gmail.com");
			
			em.persist(novoUsuario);
			em.close();
			emf.close();
			
		}
}
