package module1;

import java.util.Scanner;

public class MyFonctions {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		// utilisez la fonction et affichez le pr�nom
		String prenom = saisirPrenom(scan);
		System.out.println("Votre pr�nom est : " + prenom);
		
		String prenom2 = saisirPrenom(scan);
		System.out.println("Votre pr�nom est : " + prenom2);
		
		scan.close();

	}
	
	private static String saisirPrenom(Scanner scan) {
		
		System.out.println("Quel est votre pr�nom ?");
		String prenom = scan.nextLine();
		
		return prenom;
		
	}
	
	

}
