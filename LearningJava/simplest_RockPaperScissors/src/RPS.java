import java.util.Random;
import java.util.Scanner;
//Comparing logic: if you check for all cases where the player wins
//then the else cases will cover when the computer wins

public class RPS {
	public static void main(String[] args) {
		
	while(true) {
		Random random = new Random();
		Scanner scanner= new Scanner(System.in);

		//We will get a random index from this array
		String[] rps= {"Rock","Paper","Scissors"};
		String playerMove;
		String exit;
	
		//A while loop to keep providing scanner for right move until right one is placed
		while(true) {
			System.out.println("What is your move? ");
			
			//Display scanner input
			playerMove= scanner.nextLine();
			
			if (playerMove.equalsIgnoreCase("Rock") || playerMove.equalsIgnoreCase("Paper")||playerMove.equalsIgnoreCase("Scissors")) {
				break;
			}
			System.out.println("This is NOT a valid move!");
			System.out.println("Options: Rock/Paper/Scissors");

		}
		String computerMove= rps[random.nextInt(0,3)];
		System.out.println("This is computer move: " + computerMove);
		
		if (playerMove.equalsIgnoreCase(computerMove)){
			System.out.println("The game is a tie!");
		}
		
//		else if (playerMove.equalsIgnoreCase("r") && computerMove.equalsIgnoreCase("s")) {
//			System.out.println("You won!");
//		}
//		
//		else if (playerMove.equalsIgnoreCase("s") && computerMove.equalsIgnoreCase("p")) {
//			System.out.println("You won!");
//		}
//		
//		else if (playerMove.equalsIgnoreCase("p") && computerMove.equalsIgnoreCase("r")) {
//			System.out.println("You won!");
//		}
		
		else if (
				
				(playerMove.equalsIgnoreCase("Rock") && computerMove.equalsIgnoreCase("Scissors")) ||
				(playerMove.equalsIgnoreCase("Scissors") && computerMove.equalsIgnoreCase("Paper")) ||
				(playerMove.equalsIgnoreCase("Paper") && computerMove.equalsIgnoreCase("Rock"))
				
				)
		{System.out.println("You won!");}
		
		
		else {System.out.println("You lost!");}
		
		System.out.println("Do you want to exit the game? (y/n) ");
		exit=scanner.nextLine();
		
		if(exit.equalsIgnoreCase("y")) {break;}
			
	}
		
		
	}

}
