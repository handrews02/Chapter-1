package exercises;

import java.util.Scanner;

public class QuickExercises {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			String name;
			int num1; 
			int num2;
			Scanner inputDevice = new Scanner(System.in);
			
			System.out.println("Please enter your name >> ");
			name= inputDevice.next();
			System.out.println("Please enter a number >>");
			num1= inputDevice.nextInt();
			System.out.println("Please enter another number >>");
			num2= inputDevice.nextInt();
			System.out.println("Your total is " + (num1 + num2)); 



		
	}

}
