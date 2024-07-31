
public class AwesomeJavaProg {	

	//Anything before () is called the method name
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//This is using the ONE public method in the public Cat class
		//format: class.method()
		//it's static so doesn't need an object********
		Cat.meowmeow();
		
		
		
		//Now imagine you want multiple cats 
		//So you create cat OBJECTS 
		//Bastard Children of the whore class
		
		Cat bastard1= new Cat();
		Cat bastard2= new Cat();
		//Now the bastards have all the diseases of its whore parent
		
		//Give the bastards a name and age: aka Bastard Attributes
		bastard1.name= "Whotf";
		bastard1.age= 1;
		bastard1.dingdong();
		
		bastard2.name= "myMotherisAWhoreCat";
		bastard2.age= 0;
		
		System.out.println(bastard2.age);
		
		
		
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
	
	//private classes can only be used in that file 
	//returning method
	private static String returnName(String name, int num) {
		return "My name is" + name;
	}
}
