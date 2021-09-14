package domain;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
@DiscriminatorValue("prof")
public class professionnel extends User implements Serializable{
	public professionnel(String name, String email, String mdp, List<domain.appointment> appointment, String job, String url) {
		super(name, email, mdp, appointment);
		this.job = job;
		this.setUrl(url);
		// TODO Auto-generated constructor stub
	}
	private String job;
	private List<appointment> appointment;
	private String url;
	
	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}
	@OneToMany(mappedBy="professionnel",cascade = CascadeType.ALL)
	public List<appointment> getAppointment() {
		return appointment;
	}
	public void setAppointment(List<appointment> appointment) {
		this.appointment = appointment;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	
}
