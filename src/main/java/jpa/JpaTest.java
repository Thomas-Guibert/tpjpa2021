package jpa;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import domain.User;


public class JpaTest {


	/**
	 * @param args
	 */
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence
				.createEntityManagerFactory("dev");
		EntityManager manager = factory.createEntityManager();

		EntityTransaction tx = manager.getTransaction();
		tx.begin();
		try {
			
			//Exercice1
			
			/*
			User u1 = new User("Guibert","G@gmail.com","mdp2");
			User u2 = new User("Thomas","G@gmail.com","mdp2");
			
			manager.persist(u1);
			manager.persist(u2);
			*/
			
			//Exercice 2
			
			User u1 = new User("name", "a@gmail.com", "mdp", null);
			manager.persist(u1);
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		tx.commit();
		
		manager.close();
		factory.close();
	}

}
