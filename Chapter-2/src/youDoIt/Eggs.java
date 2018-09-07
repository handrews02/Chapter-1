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
		
		eggsOrdered = JOptionPane.showInputDialog(null, "How many eggs?",
				JOptionPane.QUESTION_MESSAGE);
		eggsWanted= Integer.parseInt(eggsOrdered);
		
		dozenEggs= eggsWanted / DOZEN_EGGS; 
		eggsLeftover = eggsWanted % DOZEN_EGGS;
	
		System.out.println("You ordered "+ eggsWanted + " eggs, which is " + dozenEggs + " dozen "  + "and " + eggsLeftover + " eggs leftover");
		
		
		
		

	}

}
