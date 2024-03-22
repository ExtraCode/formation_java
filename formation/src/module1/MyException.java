package module1;

import java.util.Scanner;

public class MyException {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Un nombre ?");
		
		int nombre = 0;
		
		try {
			nombre = scanner.nextInt();
		}catch(Exception e) {
			System.err.println("Veuillez entrer un entier");
			System.exit(0);
		}
		
		assert nombre > 30 : "Votre nombre doit être supérieur à 30";
		
		System.out.println(nombre);
		
		scanner.close();

	}

}
