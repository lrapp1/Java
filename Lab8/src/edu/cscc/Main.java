package edu.cscc;
import java.util.Scanner;

/**
 * Calculate Target Heart Rate and Maximum Heart Rate using the Karvonen Method
 * @author Laura Rapp, 11/01/21
 * Emphasis on try/catch/exceptions
 */
public class Main {
    private static Scanner input = new Scanner(System.in);

    /**
     * Main method - get user input and calculate / output target and maximum heart rate
     *
     * @param args not used
     */
    public static void main(String[] args) {
        double restingHR = getRestingHR();
        Integer age = getAge();
        System.out.println("Your target heart rate is: " +
                calculateTargetHR(restingHR, age, 0.65) + " to " +
                calculateTargetHR(restingHR, age, 0.85)
        );
        System.out.println("Your maximum heart rate is: " + calculateMaxHR(age));
    }

    /**
     * Get resting heart rate
     *
     * @return resting heart rate
     */
    public static double getRestingHR() {
        double restingHR = 0;
        String userHR;

        do {
            try {
                System.out.print("Enter your resting heart rate: ");
                userHR = input.nextLine();
                restingHR = Double.parseDouble(userHR);
                if (restingHR <= 0)
                {
                    System.out.println("Invalid input");
                }

            } catch (NumberFormatException | NullPointerException e) {
                System.out.println("Invalid input");
            }

        }while (restingHR <= 0); // Boolean false, exits once after proved
        return restingHR;
    }

    /**
     * Get person's age (years)
     * @return person's age
     */
    public static int getAge() {
        int age = 0; //initial value set to 0, if input at the end is greater than zero, the loop is false
        String userAge;

        do {
            try {
                System.out.print("Enter your age: ");
                userAge = input.nextLine();
                age = Integer.parseInt(userAge);
                if (age <= 0) //
                {
                    System.out.print("Invalid input");
                }

            } catch (NumberFormatException | NullPointerException e) {
                System.out.println("Invalid input");
            }

        }while (age <= 0); //only repeats do/while loop if age input is invalid (does not continuously prompt user for age if entered correctly first time)
        return age;
    }

    /**
     * Calculate maximum heart rate for aerobic exercise
     * @param age persons are
     * @return maximum hear rate
     */
    public static int calculateMaxHR(double age) {
        double maxHR = 220 - age;
        return (int)maxHR;
    }

    /**
     * Calculate target heart rate for aerobic exercise
     * @param restingHR resting heart rate
     * @param age person age (years)
     * @param intensity intensity of exercise (percentage 0.0 - 1.0)
     * @return target heart rate for a given intensity aerobic workout
     */
    public static int calculateTargetHR(double restingHR, double age, double intensity) {
        double targetHR = (((calculateMaxHR(age) - restingHR) * intensity) + restingHR);
        return (int)targetHR;
    }
}