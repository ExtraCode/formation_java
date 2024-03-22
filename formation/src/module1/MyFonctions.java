package module1;

import java.util.Scanner;

public class MyFonctions {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		// utilisez la fonction et affichez le prénom
		String prenom = saisirPrenom(scan);
		System.out.println("Votre prénom est : " + prenom);
		
		String prenom2 = saisirPrenom(scan);
		System.out.println("Votre prénom est : " + prenom2);
		
		scan.close();

	}
	
	private static String saisirPrenom(Scanner scan) {
		
		System.out.println("Quel est votre prénom ?");
		String prenom = scan.nextLine();
		
		return prenom;
		
	}
	
	

}
