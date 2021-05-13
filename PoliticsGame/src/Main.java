import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		mainMenu();
	}
	
	public static void mainMenu() {
		System.out.println("***Welcome to the Politics Simulator***\n");
		System.out.println("Please choose from one of these options:\n1) New Game\n2) Quit\n3) Read Instructions\n");
		
		Scanner input = new Scanner(System.in);
	    String selection = input.nextLine();
		
		switch(selection) {
		  case "1":
			  	Game newGame = new Game();
			  	newGame.runGame();
		    break;
		  case "2":
			  	System.out.println("Thank you for playing the Politics Simulator\nYou may close the window.");
		    break;
		  case "3":
			    showInstructions();
			    break;
		  default:
		    // code block
		}
		
	}
	
	public static void showInstructions() {
		System.out.println("***POLITICS SIMULATOR 1.0****\n       Designed by Andy Chaney");
		System.out.println("      c. 2021\nThis game is designed to test your decision-making when facing different electoral\nand economic environments");
		System.out.println("The game is a turn-based simulation. Each team will make moves and invest money to get more votes than opponent.");
		System.out.println("Here's how to play: \n");
		mainMenu();
	}

}

interface IGameMoves {
	public void runGame();
}
