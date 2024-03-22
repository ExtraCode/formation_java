package entity;

public class Client extends User {
	
	private String genre;
	private String adresse;
	
	public Client(int id, String nom, String prenom, int age, String genre, String adresse) {
		
		super(id, nom, prenom, age);
		this.genre = genre;
		this.adresse = adresse;
		
	}
	

	
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

}
