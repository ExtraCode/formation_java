package module1;

public class HelloWorld {
	
	public static final double TVA = 20.0/100;

	public static void main(String[] args) {
		
		double prixHT = 17.85;
		System.out.println("Prix TTC de l'article : " + prixHT * (1+TVA));
		
		// System.out.println(String.format("Prix de l'article : %s", prixHT * (1+TVA)));
		
	}

}
