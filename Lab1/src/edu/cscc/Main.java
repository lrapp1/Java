package edu.cscc;
import java.util.Scanner; // used to read from input source (in this case keyboard)
import java.lang.Math;

// Laura Rapp, 08/29/21: Java program that asks user for input of free-fall time in seconds. calculate distance object fell, and final velocity. Print distance and velocity values labelled appropriately.
public class Main {

    private static Scanner input = new Scanner(System.in); //inputs console as readable by java
    public static void main(String[] args) {
        double time, distance, velocity;
        System.out.print("Enter time (secs): ");
        float user = input.nextFloat();

        System.out.print("Distance: ");
        System.out.print(.5 * 32 * (Math.pow(user, 2))); //user input w exponent of 2
        System.out.println(" feet");

        System.out.print("Velocity: ");
        System.out.print(32 * user);
        System.out.print(" feet/sec");

    }
}
