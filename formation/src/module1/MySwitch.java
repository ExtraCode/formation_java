package module1;

public class MySwitch {

	public static void main(String[] args) {
		
		String aJeter = "�pluchures";
		
		switch(aJeter) {
		
			case "boite de conserve":
				System.out.println("Recyclage");
				break;
			case "�pluchures":
			case "trognon":
				System.out.println("Composte");
				break;
			default:
				System.out.println("Poubelle");
				break;
		}
		
		/*if(aJeter.equals("boite de conserve")) {
			System.out.println("Recyclage");
			
		}else if(aJeter.equals("�pluchures") || aJeter.equals("trognon")){
			
		}else {
			
		}*/
		

	}

}
