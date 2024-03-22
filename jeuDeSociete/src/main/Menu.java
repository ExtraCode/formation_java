package main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

import entity.Jeu;

public class Menu {

	public static void main(String[] args) {
		
		int choix = 0;
		Scanner scanner  = new Scanner(System.in);
		Scanner scannerInt  = new Scanner(System.in);
		
		// Infos de connexion à la BD
		String url = "jdbc:mysql://localhost:3306/formation";
		String utilisateur = "root";
		String password = "";		
		
		// CONNEXION A LA DB
		Connection connection = null;
		try {
			connection = DriverManager.getConnection(url, utilisateur, password);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		do {
			System.out.println("Menu");
			System.out.println("====");
			System.out.println("1 - Lister les jeux de société");
			System.out.println("2 - Ajouter un jeu de société");
			System.out.println("3 - Sortir");
			
			System.out.println("Choix : ");
			
			try {
				choix = scannerInt.nextInt();
			}
			catch (Exception e) {
				System.err.println("Veuillez choisir un entier");
				scannerInt.next(); // obligatoire sinon le scannerInt ne passe pas à la ligne suivante après une erreur
				choix = 0;
			}
			
			switch (choix) {
				case 1 :
					Jeu.listerJeux(connection);
					break;
				case 2 :
					Jeu.ajouterJeu(connection, scanner);
					break;
				case 3 :
					break;
				default :
					System.err.println("Votre choix n'est pas valide");					
					break;
			}
			
			
		} while (choix != 3);
		
			System.out.println("Bye bye!");							
		
		try {
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}			
		scanner.close();
		scannerInt.close();
	}
	
}
