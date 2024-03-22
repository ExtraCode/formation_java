package repository;

import java.util.ArrayList;

import entity.Tache;

public class TacheRepository {
	
	private static ArrayList<Tache> taches = new ArrayList<Tache>();
	
	public static ArrayList<Tache> findAll(){
		return taches;
	}
	
	public static void add(Tache tache) {
		taches.add(tache);
	}
	
	public static void delete(int id) {
		taches.removeIf(tache -> tache.getId() == id);
	}
	
	public static void markCompleted(int id) {
		
		for(Tache tache : taches) {
			
			if(tache.getId() == id) {
				tache.setCompletee(true);
				return; // stop l'ex�cution de la fonction et retourne un void
			}
			
		}
		
		// je peux aussi cr�er ma propre exception ici
		throw new IllegalArgumentException("La t�che avec l'ID "+id+" n'existe pas");
		
	}

}
