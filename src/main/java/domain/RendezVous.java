package domain;

import java.util.Date;

public class RendezVous {
	private Date date;
	private int durer;
	private String user;
	private String professionnel;
	private String description;

	public RendezVous(Date date, int durer, String user, String professionnel, String description) {
		this.date = date;
		this.durer = durer;
		this.user = user;
		this.professionnel = professionnel;
		this.description = description;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public int getDurer() {
		return durer;
	}

	public void setDurer(int durer) {
		this.durer = durer;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getProfessionnel() {
		return professionnel;
	}

	public void setProfessionnel(String professionnel) {
		this.professionnel = professionnel;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	
	
}


