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
			
			// Cr�ation de la requ�te SQL
			Statement statement = connection.createStatement();
			
			// Ex�cution de la requ�te
			String requete = "SELECT * FROM user";
			ResultSet resultSet = statement.executeQuery(requete);
			
			// It�ration sur les r�sultats
			while(resultSet.next()) {
				
				// cr�er un nouvel objet utilisateur
				users.add(new User(resultSet));
				
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return users;
	}

	public static int insert(User user) {
		
		// Requ�te SQL
		String reqInsert = "INSERT INTO user (nom, prenom, age) VALUES (?,?,?)";
		int id = 0;
		
		try {
			
			PreparedStatement prepStatement = connection.prepareStatement(reqInsert, 
					PreparedStatement.RETURN_GENERATED_KEYS);
			prepStatement.setString(1, user.getNom());
			prepStatement.setString(2, user.getPrenom());
			prepStatement.setInt(3, user.getAge());
			
			int nbLignesModifiees = prepStatement.executeUpdate();
			
			// Si l'insertion est un succ�s
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
