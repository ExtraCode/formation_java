package repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import entity.Bien;
import entity.User;

public class BienRepository {
	
	private static final Connection connection = Connexion.connect();
	
	public static ArrayList<Bien> findBiensByUser(User user) {
		
		ArrayList<Bien> biens = new ArrayList<Bien>();
		
		try {
			
			// Pr�paration de la requ�te
			String requete = "SELECT * FROM bien WHERE id_user = ?";
			PreparedStatement preparedStatement = connection.prepareStatement(requete);
			preparedStatement.setInt(1, user.getId());
			
			// Ex�cution de la requ�te
			ResultSet resultSet = preparedStatement.executeQuery();
			
			while(resultSet.next()) {
				biens.add(new Bien(resultSet));
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return biens;
		
	}

}