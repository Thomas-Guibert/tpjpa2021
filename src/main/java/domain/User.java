package domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import java.io.Serializable;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;


@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(
		name = "pro",
		discriminatorType=DiscriminatorType.STRING)
@DiscriminatorValue ("élève")
public class User implements Serializable {
	
	private int id;
	private String name;
	private String email;
	private String mdp;
	private List<appointment> appointment = new ArrayList<appointment>();
	


	public User ( String name, String email, String mdp, List<appointment> appointment) {
		this.name = name;
		this.email = email;
		this.mdp = mdp;
		this.appointment = appointment;
}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMdp() {
		return mdp;
	}
	public void setMdp(String mdp) {
		this.mdp = mdp;
	}
	@OneToMany(mappedBy="user",cascade=CascadeType.ALL)
	public List<appointment> getAppointment() {
		return appointment;
	}
	public void setAppointment(List<appointment> appointment) {
		this.appointment = appointment;
	}
	@Id
	@GeneratedValue
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	

}
