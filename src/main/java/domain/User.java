package domain;

import java.util.List;

import javax.persistence.*;

@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="person")
public class User {
	private long id;
	private String name;
	private String mail;
	private String mdp;
	private List<RendezVous> rendezvous; 

	public User(String name, String mail, String mdp, List<RendezVous> rendezvous) {
		this.name=name;
		this.mail=mail;
		this.mdp=mdp;
		this.rendezvous=rendezvous;
	}
	
	@Id
	@GeneratedValue
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	
	@OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
	public List<RendezVous> getRendezvous() {
		return rendezvous;
	}

	public void setRendezvous(List<RendezVous> rendezvous) {
		this.rendezvous = rendezvous;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getMdp() {
		return mdp;
	}

	public void setMdp(String mdp) {
		this.mdp = mdp;
	}
	
}
