package entity;

import java.text.SimpleDateFormat;
import java.util.Date;

import service.FileService;

public class Vegetal {
	
	protected String nom;
	protected String couleur;
	
	public Vegetal(String nom, String couleur) {
		this.nom = nom;
		this.couleur = couleur;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getCouleur() {
		return couleur;
	}

	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}

	public String infos() {
		
		return nom + ", qui est " + couleur;
		
	}

	public void registre(Fichier fichier, String contenu) {
		
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy 'à' HH'h'mm");
		
		FileService.ecrireSuite(fichier.getFile(), "\n[" + sdf.format(date) + "] : vente " + contenu);
		
	}

}
