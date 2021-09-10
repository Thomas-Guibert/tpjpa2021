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
			User u1 = new User("Val","gazehmazr","mdp");
			manager.persist(u1);
			
			
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		tx.commit();
		
		manager.close();
		factory.close();
	}

}
