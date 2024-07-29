
public class CondtionalsPrac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		if () {}
//		
//		else if () {}
//		
//		else {}
		nameCheck("Eminem");
		nameCheck("Marshall");
		nameCheck("mArshall maThErs");
		
		ageCheck(100);
		ageCheck(2);
	}
	
	private static void nameCheck(String name) {
		
		if (name.equalsIgnoreCase("Eminem")) {
			System.out.println("This is Slim Shady");
		}
		
		else if (name.equalsIgnoreCase("Marshall Mathers")) {
			System.out.println("This is Slim Shady");
		}
		
		else {System.out.println("This is NOT Slim Shady");
		}

	}
	
	private static void ageCheck(int age) {
			
			if (age == 21) {
				System.out.println("You may drink");
			}
			
			else if (age > 21 ) {
				System.out.println("Drink till you pass out!");
			}
			
			else {System.out.println("Haram");
			}
	
		}

}
