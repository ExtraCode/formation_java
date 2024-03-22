package service;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class FileService {
	
	public static File creerFichier(String chemin) {
		
		File fichier = new File(chemin);
		
		// Vérifier si le fichier
		if (!fichier.exists()) {
			
			try {
				fichier.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}			
			
		}
		
		return fichier;
		
	}

	public static void ecrire(File fichier, String contenu) {
		
		try(FileWriter writer = new FileWriter(fichier)) {
			
			// Ecriture dans un fichier
			writer.write(contenu);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public static void ecrireSuite(File fichier, String contenu) {
		
		try(FileWriter writer = new FileWriter(fichier, true);
				BufferedWriter bufferedWriter = new BufferedWriter(writer)
		)
		{
			
			bufferedWriter.write(contenu);
			
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

	public static ArrayList<String> lire(File fichier) {
		
		ArrayList<String> lignes = new ArrayList<String>();
		
		try (BufferedReader reader = new BufferedReader(new FileReader(fichier))) {
			String ligne;
			while((ligne = reader.readLine()) != null) {
				
				lignes.add(ligne);
				
			}
			
	    } catch (IOException e) {
	    	e.printStackTrace();
	    }
		
		return lignes;
		
	}
}