package module1;

public class MyTableau {
	
	public static final int MULTIPLICATEUR = 5;

	public static void main(String[] args) {
		
		String[] fruits = {"banane","fraise","cerise"};
		
		// écrire dans une case
		fruits[2] = "orange";
		
		// afficher une case du tableau
		System.out.println(fruits[1]);
		
		
		// Créer un tableau d'entier qui prendra 3 valeurs au choix
		// Afficher la seconde valeur du tableau (index 1) multiplée
		// par le multiplicateur
		int[] nombres = {50, 152, 33};
		System.out.println(nombres[1] * MULTIPLICATEUR);
		
		

	}

}