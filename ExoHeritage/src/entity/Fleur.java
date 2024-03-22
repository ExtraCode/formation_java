package entity;

public class Fleur extends Vegetal {
	
	private String signification;

	public Fleur(String nom, String couleur, String signification) {
		super(nom, couleur);
		this.setSignification(signification);
	}
	
	@Override
	public void registre(Fichier fichier, String contenu) {
		
		super.registre(fichier, "d'une fleur");
		
	}
	
	@Override
	public String infos() {
		
		return "Une fleur : " + super.infos() + " et qui fait référence à " + signification;
		
	}

	public String getSignification() {
		return signification;
	}

	public void setSignification(String signification) {
		this.signification = signification;
	}

}
