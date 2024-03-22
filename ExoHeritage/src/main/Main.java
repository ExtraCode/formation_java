package main;

import java.util.Scanner;

import entity.Fichier;
import entity.Fleur;
import entity.Legume;
import entity.Plante;
import entity.Vegetal;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("//// Que souhaitez vous acheter ? ////\n"
				+ "1 - Une fleur\n"
				+ "2 - Un légume\n"
				+ "3 - Une plante\n"
		);
		
		Scanner scan = new Scanner(System.in);
		int choix = 0;
		
		try {
			choix = scan.nextInt();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("Vous venez d'acheter : ");
		
		Vegetal vegetal = null;
		
		if(choix == 1) {
			vegetal = new Fleur("Rose","rose","L'amour, évidemment");
		}else if(choix == 2) {
			vegetal = new Legume("Carotte","orange","printemps");
		}else if(choix == 3) {
			vegetal = new Plante("Ficus","vert",50,3);
		}
		
		System.out.println(vegetal.infos());
		
		Fichier fichier = new Fichier("registre.txt");
		vegetal.registre(fichier,null);
		
		scan.close();

	}

}
