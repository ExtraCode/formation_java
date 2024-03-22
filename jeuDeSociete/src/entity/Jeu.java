package entity;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

public class Jeu {
	private int id;
	private String nom;
	private double prix;
	
	public Jeu(String nom, double prix) {
		this.nom = nom;
		this.prix = prix;
	}
	
	public Jeu(ResultSet resultSet) {
		
		try {
			this.id = resultSet.getInt("id");
			this.nom = resultSet.getString("nom");
			this.prix =  resultSet.getDouble("prix");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void listerJeux(Connection connection) {
		try {
			
			// Création de la requête SQL
			String requete = "SELECT * FROM jeu";
			Statement statement = connection.createStatement();
			
			// Exécution de la requête
			ResultSet resultSet = statement.executeQuery(requete);
			
			ArrayList<Jeu> jeux = new ArrayList<Jeu>();
			
			//Itération sur les résultats
			while (resultSet.next()) {
				
				// Créer un nouvel objet utilisateur
				jeux.add(new Jeu(resultSet));				
			}
			
			// Affichage
			for (Jeu jeu: jeux) {
				System.out.println(jeu.getId() + " : " + jeu.getNom());
			}

			// Fermeture des ressources
			resultSet.close();
			statement.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}		
	}
	
	public static void ajouterJeu(Connection connection, Scanner scanner) {
		
		System.out.println("Ajout de jeu");					
		System.out.println("============");
		
		System.out.println("Nom :");
		String nom = scanner.nextLine();

		System.out.println("Prix :");
		
		boolean prixOk = false;
		double prix = 0.0;
		do {
			try {
				prix = scanner.nextDouble();
				prixOk = true;
			}
			catch (Exception e) {
				System.err.println("Le prix doit être décimal");
				scanner.next();
			}
		} while (!prixOk);
				
		Jeu jeu = new Jeu(nom, prix);		
		
		// Requête SQL
		String reqInsert = "INSERT INTO jeu (nom,prix) VALUES (?,?)";
		try {
			PreparedStatement prepStatement = connection.prepareStatement(reqInsert, PreparedStatement.RETURN_GENERATED_KEYS);
			prepStatement.setString(1,  jeu.getNom());
			prepStatement.setDouble(2,  jeu.getPrix());
			
			int nbLignesModifiees = prepStatement.executeUpdate();
			if (nbLignesModifiees > 0) {
				
				ResultSet resultSet = prepStatement.getGeneratedKeys();
				resultSet.next();
				int id = resultSet.getInt(1);
				System.out.println("Insertion effectuée avec succès avec id: " + id);
			}
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	public int getId() {
		return id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public double getPrix() {
		return prix;
	}
	public void setPrix(double prix) {
		this.prix = prix;
	}

}
