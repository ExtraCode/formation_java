package repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import entity.User;

public class UserRepository {
	
	private static final Connection connection = Connexion.connect();
	
	public static ArrayList<User> findAll(){
	
		ArrayList<User> users = new ArrayList<User>();
		
		// AFFICHAGE DES DONNEES
		try {
			
			// Création de la requête SQL
			Statement statement = connection.createStatement();
			
			// Exécution de la requête
			String requete = "SELECT * FROM user";
			ResultSet resultSet = statement.executeQuery(requete);
			
			// Itération sur les résultats
			while(resultSet.next()) {
				
				// créer un nouvel objet utilisateur
				users.add(new User(resultSet));
				
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return users;
	}

	public static int insert(User user) {
		
		// Requête SQL
		String reqInsert = "INSERT INTO user (nom, prenom, age) VALUES (?,?,?)";
		int id = 0;
		
		try {
			
			PreparedStatement prepStatement = connection.prepareStatement(reqInsert, 
					PreparedStatement.RETURN_GENERATED_KEYS);
			prepStatement.setString(1, user.getNom());
			prepStatement.setString(2, user.getPrenom());
			prepStatement.setInt(3, user.getAge());
			
			int nbLignesModifiees = prepStatement.executeUpdate();
			
			// Si l'insertion est un succès
			if(nbLignesModifiees > 0) {
				
				ResultSet resultset = prepStatement.getGeneratedKeys();
				resultset.next();
				id = resultset.getInt(1);
				
			}
			
		} catch (SQLException e) {
		
			e.printStackTrace();
		}
		
		return id;
		
	}
	
}
