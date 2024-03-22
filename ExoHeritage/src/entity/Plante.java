package entity;

public class Plante extends Vegetal {
	
	private double hauteur;
	private int age;
	
	public Plante(String nom, String couleur, double hauteur, int age) {
		super(nom, couleur);
		this.hauteur = hauteur;
		this.age = age;
	}
	
	@Override
	public void registre(Fichier fichier, String contenu) {
		
		super.registre(fichier, "d'une plante");
		
	}
	
	@Override
	public String infos() {
		
		return "Une plante : " + super.infos() + " qui mesure " + hauteur + "cm et qui a " + age + " ans";
		
	}

	public double getHauteur() {
		return hauteur;
	}

	public void setHauteur(double hauteur) {
		this.hauteur = hauteur;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
