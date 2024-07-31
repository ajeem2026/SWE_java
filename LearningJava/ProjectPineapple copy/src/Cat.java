//Advantage of OOP
//You can put shit in another java file and whore it around: it's called
//a class
//a classy cat whore is now being created

public class Cat {
	
	//Attributes of the bastards
	String name;
	int age;

	//Shit the bastards can do
	//This is a whore method in the whore class
	//these static methods are independent bitches 
	//they do not need to be treated with objects
	public static void meowmeow() {
		// TODO Auto-generated method stub
		System.out.println("Meow meow I'm a cat");
	}
	
	//*******VERY VERY IMPORTANT POINT THIS IS******************
	//these non-static methods are NOT independent bitches
	public void dingdong() {
		System.out.println("im not static so I need to be used like an object :(");
	}
	

//# First use of a class
//Main use of a separate class like this is so that it does not
	//clutter up your MAIN class

//Second use
	//Blueprint to create objects 
	//Now I can make my cat as I wish and change it as I wish
	//without fucking up my main file
	
}
