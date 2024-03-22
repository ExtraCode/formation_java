package entity;

public class Admin extends User {
	
	private String role;
	private int salaire;
	
	
	public Admin(int id, String nom, String prenom, int age, String role, int salaire) {
		
		super(id,nom,prenom,age);
		this.role = role;
		this.salaire = salaire;

	}
	
	@Override
	public String getInfos() {
		return super.getInfos() + " détient le role " + role;
	}
	
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public int getSalaire() {
		return salaire;
	}
	public void setSalaire(int salaire) {
		this.salaire = salaire;
	}

}
