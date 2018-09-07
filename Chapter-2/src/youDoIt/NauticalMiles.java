package youDoIt;

import javax.swing.JOptionPane;

public class NauticalMiles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double kilometers= 1.852;
		double miles= 1.150779;
		double nauticalMilesToMiles;
		double nauticalMilesToKilometers;
		String nauticalMilesEntered; 
		double nauticalMiles;
		
		nauticalMilesEntered = JOptionPane.showInputDialog(null, "How many nautical miles?",
				JOptionPane.QUESTION_MESSAGE);
		nauticalMiles= Integer.parseInt(nauticalMilesEntered);
		
		nauticalMilesToMiles = nauticalMiles * miles;
		nauticalMilesToKilometers = nauticalMiles * kilometers;
		
		JOptionPane.showMessageDialog(null, "The conversion of Nautical Miles to Miles is " + nauticalMilesToMiles);
		JOptionPane.showMessageDialog(null, "The conversion of Nautical Miles to Kilometers is " + nauticalMilesToKilometers);
		
	}

}
