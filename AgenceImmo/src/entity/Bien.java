package entity;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Bien {
	
	private int id;
	private int idUser;
	private String adresse;
	private int prix;

	public Bien(ResultSet resultSet) {
		try {
			
			this.id = resultSet.getInt("id");
			this.idUser = resultSet.getInt("id_user");
			this.adresse = resultSet.getString("adresse");
			this.prix = resultSet.getInt("prix");
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public int getPrix() {
		return prix;
	}

	public void setPrix(int prix) {
		this.prix = prix;
	}

	public int getIdUser() {
		return idUser;
	}

	public void setIdUser(int idUser) {
		this.idUser = idUser;
	}

}
