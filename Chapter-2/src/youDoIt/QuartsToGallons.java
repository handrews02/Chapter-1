package youDoIt;

import javax.swing.JOptionPane;

public class QuartsToGallons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String quartsRequested; 
	
		int QUARTS_IN_GALLONS=4;
		int quartsWanted;
		int totalGallons;
		int quartsRemaining;
		
		quartsRequested = JOptionPane.showInputDialog(null, "How many quarts?",
				JOptionPane.QUESTION_MESSAGE);
		quartsWanted= Integer.parseInt(quartsRequested);
		
		totalGallons= quartsWanted/QUARTS_IN_GALLONS;
		quartsRemaining= quartsWanted%QUARTS_IN_GALLONS;
		
		JOptionPane.showMessageDialog(null, "Number of gallons " + totalGallons + ", quarts leftover " + quartsRemaining); 
	
		

		
	
	
		
		

	
		
		
		
		
		
		
			
		
	}

}
