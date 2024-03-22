package module1;

import java.util.Scanner;

public class MyScanner {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Quel age as tu ?");
		int age = scan.nextInt();
		
		String prenom = "Alan";
		
		scan.close();
		
		if(age > 18 && prenom.length() != 0 && prenom.equals("bob")) {
			
			System.out.println("Tu es majeur");
			
		}else if(prenom.equals("Alan") || age >= 18) {
			
			System.out.println("Ah, tiens, le formateur");
			
		}else {
			
			System.out.println("Tu es mineur");
			
		}
		
	}

}
