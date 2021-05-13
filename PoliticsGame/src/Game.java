import java.util.Random;

public class Game {
	Random rand = new Random();
	String environment;
	int randomNumber = rand.nextInt(3);
	int turnNumber = 1;

	public void runGame() {
		decideEnvironment(randomNumber);
		Party dem = new DemocraticParty();
		Party rep = new RepublicanParty();
		
		for (int i = 0; turnNumber <= 10; i++) {
			System.out.println("It is currently turn number: " + turnNumber);
			
			if (turnNumber == 10) {
				finalRound();
			}
			
			else {
				turnRound(dem, rep);
			}
			
			turnNumber++;
		}	
	}
	
	public void decideEnvironment(int random) {
		switch(random) {
		  case 1:
			  System.out.println("It is currently a left-leaning political environment\n");
			  environment = "Dem";
		    break;
		  case 2:
			  System.out.println("It is currently a right-leaning political environment\n"); 
			  environment = "Rep";
		    break;
		  case 3:
			  System.out.println("It is a neutral political environment\n");
			  environment = "Equal";
			    break;
		  default:
			  System.out.println("It is a neutral political environment\n");
			  environment = "Equal";
		}
	}

	public void turnRound(Party dem, Party rep) {
		dem.processTurn();
		rep.processTurn();
	}
	
	public void finalRound() {
		System.out.println("Testing final turn round");
	}
	

}
