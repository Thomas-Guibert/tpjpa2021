package domain;

public class User {
	private String name;
	private String mail;
	private String mdp;
	
	public User(String name, String mail, String mdp) {
		this.name=name;
		this.mail=mail;
		this.mdp=mdp;
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
