package entity;

import java.sql.ResultSet;

import contract.Presentation;

public abstract class User implements Presentation{
	
	protected int id;
	protected String nom;
	protected String prenom;
	private int age;
	
	public User(ResultSet resultset) {
		
		try {
			
			this.id = resultset.getInt("id");
			this.nom = resultset.getString("nom");
			this.prenom = resultset.getString("prenom");
			this.age = resultset.getInt("age");
			
		}catch(Exception e) {
			
			e.printStackTrace();
			
		}
		
	}
	
	public User(int id, String nom, String prenom, int age) {
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
	}
	

	@Override
	public String toString() {
		
		return "Id : " + this.id + 
				" prénom : " + this.prenom + 
				" nom : " + this.nom;
		
	}
	
	public String getInfos() {
		return "L'user avec l'id " + id +" : " + nom + " " + prenom;
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

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
