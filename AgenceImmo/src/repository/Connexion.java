package repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connexion {
	
	// Infos de connexion à la BDD
	private static String url = "jdbc:mysql://localhost:3306/formation";
	private static String utilisateur = "root";
	private static String password = "";
	
	public static Connection connect() {
		
		//CONNEXION A LA DB
		Connection connection = null;
		try {
			connection = DriverManager.getConnection(url, utilisateur, password);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return connection;
		
	}

}