
public class RepublicanParty extends Party {
	String name = "Republican Party";
	int voteTotals;
	double budget = 10000;

	@Override
	public void processTurn() {
		System.out.println("It is the Republican Party's turn. Your budget is: ");
		System.out.println("Choose which option you would like to do:\n");
		System.out.println("Please choose from one of these options:\n1) Buy Ads\n2) Send Staff into Field\n3) Do nothing\n");
		
		switch(selection) {
		  case 1:
			  System.out.println("Testing ad buy\n");
		    break;
		  case 2:
			  System.out.println("Testing send staff into field\n");
		    break;
		  case 3:
			  System.out.println("Testing wait\n");
			    break;
		  default:
		    // code block
			}
		}
	}
