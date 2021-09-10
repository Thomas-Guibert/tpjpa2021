package domain;

public class Professionnel {
	private int id;
	private String url;
	private String job;
	
	
	public Professionnel(int id,String url, String job) {
		this.id=id;
		this.url=url;
		this.job=job;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
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
