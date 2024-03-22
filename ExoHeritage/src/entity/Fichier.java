package entity;

import java.io.File;

import service.FileService;

public class Fichier {
	
	private String chemin;
	private File file;
	
	public Fichier(String chemin) {
		this.chemin = chemin;
		this.file = FileService.creerFichier(chemin);
	}

	public String getChemin() {
		return chemin;
	}

	public File getFile() {
		return file;
	}

}
