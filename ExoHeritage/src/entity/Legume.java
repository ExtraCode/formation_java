package entity;

public class Legume extends Vegetal {
	
	private String saison;

	public Legume(String nom, String couleur, String saison) {
		super(nom, couleur);
		this.saison = saison;
	}
	
	@Override
	public void registre(Fichier fichier, String contenu) {
		
		super.registre(fichier, "d'un l�gume");
		
	}
	
	@Override
	public String infos() {
		
		return "Un l�gume : " + super.infos() + " et qui se plante au " + saison;
		
	}

	public String getSaison() {
		return saison;
	}

	public void setSaison(String saison) {
		this.saison = saison;
	}
	
	

}
