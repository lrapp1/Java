// Laura Rapp, 09/21/21, Program that calculates Body Mass Index (BMI) through input by user.
package edu.cscc;
import java.util.Scanner;

public class Main {

    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        double lbs, inches, meters, kgs, bmi;
        String classification;

	System.out.println("Enter weight (lbs): ");
    Double uLbs = input.nextDouble(); //variable name which stores input (in this case weight per lbs) from user

	System.out.println("Enter height (inch): ");
	Double uInch = input.nextDouble();

	double uKgs = convertToKilograms(uLbs);

	double uMeters = convertToMeters(uInch);

	double uBmi = calcBMI(uKgs, uMeters);

	bmiClassification(uBmi);
    }

    public static double convertToKilograms(double k) { //variables which reside in other methods ARE DIFFERENT THAN MAIN, EVEN IF THEY HAVE THE SAME NAME
        double kgs = k / 2.2046;
        return kgs;
    }

    public static double convertToMeters(double i) { //Only one parameter (this case inches from the user) is plugged in because that is the only variable we want to change in Main.
        double meters = i / 39.37;
        return meters;
    }

    public static double calcBMI(double k, double m) {
        double bmi = k / Math.pow(m,2);
        System.out.println("Your BMI is " + bmi);
        return bmi;
    }

    public static void bmiClassification(double b) {
        if (b <= 18.5)
            System.out.println("Your BMI classification is Underweight");
        else if (b <= 25.0)
            System.out.println("Your BMI classification is Normal");
        else if (b <= 30.0)
            System.out.println("Your BMI classification is Overweight");
        else
            System.out.println("Your BMI classification is Obese");
    }
}
