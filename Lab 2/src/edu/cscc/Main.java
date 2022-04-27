package edu.cscc;
import java.util.Scanner;

// Laura Rapp, 09/13/2021, Program that determines the intensity of a storm based upon wind speed taken from the user.
public class Main {
    private static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
	    long speed;
	    String classification;
        String user;
        System.out.println("Enter the wind speed (mph): ");
        user = input.nextLine();
        user = user.trim(); //Removes leading/trailing spaces from user input
        int parsedWindSpeed = 0;
        try{
            parsedWindSpeed = Integer.parseInt(user); //function parsed/int will submit error if input is not an integer
        } catch(Exception e){
            System.out.println("Does not compute");
            return; //Stops main class if user input is not a valid integer
        }

        if (parsedWindSpeed <= 0)
            System.out.println("Invalid Input :)");
        else if (parsedWindSpeed <= 39)
            System.out.println("Not in Scale");
        else if (parsedWindSpeed <= 73)
            System.out.println("Tropical Storm");
        else if (parsedWindSpeed <= 95)
            System.out.println("Category One Hurricane");
        else if (parsedWindSpeed <= 110)
            System.out.println("Category Two Hurricane");
        else if (parsedWindSpeed <= 129)
            System.out.println("Category Three Hurricane");
        else if (parsedWindSpeed <= 156)
            System.out.println("Category Four Hurricane");
        else
            System.out.println("Category Five Hurricane");

        }
    }