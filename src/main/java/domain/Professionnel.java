package domain;

import java.util.List;

import javax.persistence.*;

@Entity
@DiscriminatorValue("U")
public class Professionnel extends User{

	private String url;
	private String job;
	
	public Professionnel(String name, String mail, String mdp, List<RendezVous> rendezvous,String job, String url) {
		super(name, mail, mdp, rendezvous);
		this.url=url;
		this.job=job;
	}

	public String getUrl() {
		return url;
	}


	public void setUrl(String url) {
		this.url = url;
	}


	public String getJob() {
		return job;
	}


	public void setJob(String job) {
		this.job = job;
	}
}
