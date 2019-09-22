import java.util.Scanner;

public class Woodruff_p2 {
	public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);

	//Categories Print statements
	    System.out.println("BMI Categories:");
	    System.out.println("Underweight = < 18.5");
	    System.out.println("Normal Weight = 18.5-24.9");
	    System.out.println("Overweight = 25-29.9");
	    System.out.println("Obesity = BMI of 30 or greater");
	    System.out.println("");

	    System.out.println("To find BMI using pounds and inches press 1");
	    System.out.println("To find BMI using kilograms and meters press 2");

	    int user = in.nextInt();
	    double BMI = in.nextDouble();


	//pounds 
	    if (user == 1){
	      System.out.println("Enter weight in pounds: ");
	      double weightInPounds = in.nextDouble();

	      System.out.println("Enter height in inches: ");
	      double heightInInches = in.nextDouble();

	      heightInInches = heightInInches * heightInInches;

	      BMI = (703 * weightInPounds) / heightInInches;

	      System.out.print("BMI: ");
	      System.out.printf("%.0f", BMI);
	      System.out.println("");
	    }

	//kilograms

	    if (user == 2){
	      System.out.println("Enter weight in kilograms: ");
	      double weightInKilograms = in.nextDouble();

	      System.out.println("Enter height in meters: ");
	      double heightInMeters = in.nextDouble();

	      heightInMeters = heightInMeters * heightInMeters;

	      BMI = (weightInKilograms) / heightInMeters;

	      System.out.print("BMI: ");
	      System.out.printf("%.0f", BMI);
	      System.out.println("");
	    }
	    
	    else {
	      System.out.print("Please enter 1 or 2");
	   
	    }

	    in.close();

	  }
	
}
