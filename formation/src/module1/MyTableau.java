package module1;

public class MyTableau {
	
	public static final int MULTIPLICATEUR = 5;

	public static void main(String[] args) {
		
		String[] fruits = {"banane","fraise","cerise"};
		
		// �crire dans une case
		fruits[2] = "orange";
		
		// afficher une case du tableau
		System.out.println(fruits[1]);
		
		
		// Cr�er un tableau d'entier qui prendra 3 valeurs au choix
		// Afficher la seconde valeur du tableau (index 1) multipl�e
		// par le multiplicateur
		int[] nombres = {50, 152, 33};
		System.out.println(nombres[1] * MULTIPLICATEUR);
		
		

	}

}