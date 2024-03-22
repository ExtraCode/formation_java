package module1;

public class MyBoucles {

	public static void main(String[] args) {
		
		int[] chiffresDuLoto = {10, 14, 35, 20, 75};
		
		for(int chiffre : chiffresDuLoto) {
			
			System.out.println(chiffre);
			
		}
		
		// deuxieme possibilité
		for(int i = 0; i < chiffresDuLoto.length; i++){
			System.out.println(chiffresDuLoto[i]);
		}
		
		// while
		int age = 10;
		while(age < 15) {
			age++;
			System.out.println("Bon anniversaire");
		}
		
		System.out.println("Tu as "+age+" ans");
		
		// do while
		int age2 = 10;
		do {
			
			System.out.println("Bon anniversaire");
			age2++;
			
		}while(age2 < 15);
		
		System.out.println("Tu as "+age2+" ans");

	}

}
