package jpa;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import domain.professionnel;
import domain.User;
import dao.dao.*;


public class JpaTest {


	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*EntityManagerFactory factory = Persistence
				.createEntityManagerFactory("dev");
		EntityManager manager = factory.createEntityManager();*/
		
		DaoUser u = new DaoUser();
		professionnelDao p = new professionnelDao();
		DaoAppointment r = new DaoAppointment();
		
		/*EntityTransaction tx = manager.getTransaction();
		tx.begin();*/
		try {
			u.createUser();
			p.createprofessionnel();
			
			
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
		//u.getUserappointment("thomas.g@etudiant.univ-rennes1.fr");
		
		/*manager.close();
		factory.close();*/
	}

}