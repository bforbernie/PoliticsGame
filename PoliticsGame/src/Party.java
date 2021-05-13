
public class Party {
	int selection;
	String name;
	int voteTotals;
	double budget;
	
	public void processTurn() {
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
	
	 public String getName() {
		    return name;
		  }

	 public void setName(String newName) {
		    this.name = newName;
		  }
	 
	 public int getVotes() {
		 return voteTotals;
	 }
	 
	 public void setVotes(int votes) {
		 this.voteTotals = votes;
	 }
	 
	 public double getBudget() {
		 return budget;
	 }
	 
	 public void setBudget(double budgetChange) {
		 this.budget = budgetChange;
	 }

}
