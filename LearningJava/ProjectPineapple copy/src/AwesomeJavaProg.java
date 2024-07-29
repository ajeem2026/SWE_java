
public class AwesomeJavaProg {

	//Anything before () is called the method name
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//You cannot call a method upon a primitive variable
		//myInt. (dot) something isn't going to give you any methods
		int myInt= 23;
		
		//TestingOutMethods
		String name= "Abid";
		System.out.println("Applying methods on String dataType: ");
		System.out.println(name.length());
		System.out.println(name.toUpperCase());
		
		//Declaring self-written methods
		burp();
		printName("Slim Shady", 5);
		String naam= returnName("Slim", 3);
		
	}

	//A method that we need to call INSIDE THE MAIN METHOD
	//void method without parameter
	
	private static void burp() {
		System.out.println("Private method call: Burrrrrrp");
	}
	
	//void method with parameter (can pass multiple parameters)
	private static void printName(String name, int num) {
		System.out.println("My name is "+ name);
	}
	
	//returning method
	private static String returnName(String name, int num) {
		return "My name is" + name;
	}
}
