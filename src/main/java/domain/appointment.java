package domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class appointment implements Serializable {
	public appointment(Date date, int length, User User, professionnel professionnel, String description) {
		this.date = date;
		this.length = length;
		this.User = User;
		this.professionnel = professionnel;
		this.description = description;
	}
	private int id;
	private Date date;
	private int length;
	private User User;
	private professionnel professionnel;
	private String description;
	
	@Id
	@GeneratedValue
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	@ManyToOne
	public User getUser() {
		return User;
	}
	public void setUser(User user) {
		User = user;
	}
	@ManyToOne
	public professionnel getProfessionnel() {
		return professionnel;
	}
	public void setProfessionnel(professionnel professionnel) {
		this.professionnel = professionnel;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	

}
