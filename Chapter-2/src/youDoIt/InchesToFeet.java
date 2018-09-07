package youDoIt;

import javax.swing.JOptionPane;

public class InchesToFeet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
			int INCHES_IN_FEET= 12;
			String inchesRequested;
			int inchesEntered;
			int inchesToFeet;
			int inchesLeftover; 
			
			inchesRequested = JOptionPane.showInputDialog(null, "How many inches?",
					JOptionPane.QUESTION_MESSAGE);
			inchesEntered= Integer.parseInt(inchesRequested);
			
			inchesToFeet = inchesEntered / INCHES_IN_FEET;
			inchesLeftover = inchesEntered % INCHES_IN_FEET;
			
			JOptionPane.showMessageDialog(null, "Your inches to feet conversion is " + inchesToFeet + " feet, " + inchesLeftover + " inches");
			
	}

}
