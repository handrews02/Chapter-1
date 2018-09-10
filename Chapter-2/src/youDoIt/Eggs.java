package youDoIt;

import javax.swing.JOptionPane;

public class Eggs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int DOZEN_EGGS = 12;
		double dozenEggsCost = 3.25;
		double singleEggCost = 0.45;
		String eggsOrdered;
		int eggsWanted;
		int dozenEggs; 
		int eggsLeftover;
		double cost; 
		double dozenEggCost; 
		double singleEggsCost; 
		
		eggsOrdered = JOptionPane.showInputDialog(null, "How many eggs?",
				JOptionPane.QUESTION_MESSAGE);
		eggsWanted= Integer.parseInt(eggsOrdered);
		
		dozenEggs= eggsWanted / DOZEN_EGGS; 
		eggsLeftover = eggsWanted % DOZEN_EGGS;
		dozenEggCost= dozenEggs * 3.25;
		singleEggsCost= eggsLeftover * 0.45;
		cost= dozenEggCost + singleEggCost; 
	
		System.out.println("You ordered "+ eggsWanted + " eggs. That is " + dozenEggs + " dozen at $3.25 per dozen "  + "and " + eggsLeftover + 
				" loose eggs at $0.45 each for a total of $" + cost);
		
		
		
		

	}

}
