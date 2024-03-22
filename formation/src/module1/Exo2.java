package module1;

public class Exo2 {

	public static void main(String[] args) {
		
		int age = 30;
		age = vieillir(age);
		System.out.println(age);

	}
	
	private static int vieillir(int age) {
		
		age = age +1;
		
		return age;
		
	}

}
