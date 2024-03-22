package main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import service.FileService;

public class Main {
	
	public static void main(String[] args) {
		
		File fichier = FileService.creerFichier("log.txt");
		
		FileService.ecrire(fichier, "Une ligne de texte");
		
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("d/MM/y HH:mm:ss");
		
		FileService.ecrireSuite(fichier, "\n" + sdf.format(date) + " : Tiens, une nouvelle ligne\n");
		
		ArrayList<String> contenuFichier = FileService.lire(fichier);
		
		for(String ligne : contenuFichier) {
			
			System.out.println(ligne);
			
		}
		
		
	
	}
}
