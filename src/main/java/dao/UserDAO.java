package dao;

import java.util.List;

import javax.naming.ldap.ManageReferralControl;

import domain.RendezVous;
import domain.User;
import jpa.EntityManagerHelper;

@SuppressWarnings("unused")
public class UserDAO extends AbstractJpaDao <Long,User>{

	public UserDAO() {
		super(User.class);
	} 
	
	public void createUser() {
		save(new User("Thomas", "Thomas.g@etudiant.univ-rennes1.fr", "Univ1mdp", null));
		save(new User("Neiro", "neiro.red@gmail.com", "Azerty123", null));
		save(new User("Alice", "Alice@orange.fr", "mdpFacile", null));
		save(new User("Sheina", "Sh@gmail.com", "PassW", null));
	}
	
	public void getAllUserName() {
		List<String> resultList = EntityManagerHelper.getEntityManager().createQuery("Select name From User", String.class).getResultList();
		System.out.println("Nombre d'utilisateur:" + resultList.size());
		for (String next : resultList) {
			System.out.println("next employee: " + next);
		}
	}
	
	public void getAllUser() {
		List<User> resultList = EntityManagerHelper.getEntityManager().createQuery("Select a From User a", User.class).getResultList();
		System.out.println("Nombre d'utilisateur:" + resultList.size());
		for (User next : resultList) {
			System.out.println("next employee: " + next);
		}
	}


}
