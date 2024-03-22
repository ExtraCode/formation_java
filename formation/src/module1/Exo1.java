package module1;

import java.util.Scanner;

public class Exo1 {

	public static void main(String[] args) {
		
		System.out.println("Quel est ton prénom ?");
		Scanner scan = new Scanner(System.in);
		
		String prenom = scan.nextLine();
		
		if(prenom.length() != 0) {
			
			System.out.println("Ok, c'est toi " + prenom);
			
		}else {
			
			System.err.println("Le prénom est vide");
			
		}
		
		scan.close();

	}

}
