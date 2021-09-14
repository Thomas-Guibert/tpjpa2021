package jpa;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import domain.Professionnel;
import domain.User;
import dao.*;


public class JpaTest {


	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*EntityManagerFactory factory = Persistence
				.createEntityManagerFactory("dev");
		EntityManager manager = factory.createEntityManager();*/
		
		UserDAO u = new UserDAO();
		ProfessionnelDAO p = new ProfessionnelDAO();
		RendezVousDAO r = new RendezVousDAO();
		
		/*EntityTransaction tx = manager.getTransaction();
		tx.begin();*/
		try {
			//u.createUser();
			//p.createProfessionnel();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		//tx.commit();
		
		u.getAllUserName();
		p.getAllProfessionnelName();
		u.updateMdp(u.getUserByMail("thomas.g@etudiant.univ-rennes1.fr").get(0), "NewMDP");
		//u.deleteUserByMail("thomas.g@etudiant.univ-rennes1.fr");
		u.getAllUserMdp();
		r.createRDV(u.getUserByMail("thomas.g@etudiant.univ-rennes1.fr").get(0), p.getProfessionnelByMail("ax@gmail.com").get(0));
		//u.getUserRendezVous("thomas.g@etudiant.univ-rennes1.fr");
		
		System.out.println(u.showUser(u.getUserByMail("thomas.g@etudiant.univ-rennes1.fr").get(0)));
		
		System.out.println(u.showAllUser(u.getAllUser()));
		/*manager.close();
		factory.close();*/
	}

}
