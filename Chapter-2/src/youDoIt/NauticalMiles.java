package youDoIt;

public class NauticalMiles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double kilometers= 1.852;
		double miles= 1.150779;
		double nauticalMile;
		double nauticalMilesToMiles;
		double nauticalMilesToKilometers;
		double nauticalMilesEntered= 20;
		
		nauticalMilesToMiles = nauticalMilesEntered * miles;
		nauticalMilesToKilometers = nauticalMilesEntered * kilometers;
		
		System.out.println("The conversion of Nautical Miles to Miles is " + nauticalMilesToMiles);
		System.out.println("The conversion of Nautical Miles to Kilometers is " + nauticalMilesToKilometers);
		
	}

}
