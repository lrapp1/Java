package edu.cscc;

import java.util.Arrays;
import java.util.Scanner;

//Laura Rapp, 9/27/2021, Program which takes input from the user to populate a "Grocery List" of up to six items. A variable count is used to keep track of the number of items added to the array. Duplicate inputs are marked as an error.

public class Main {

    private static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int count = 0; //number of items currently in list

        String[] groceryList = new String[6]; //string array to store grocery list items (6). Variable defined on single line.

        while (count < groceryList.length) //while the count of the list is below the max (6)
        {

            System.out.print("Enter Grocery List item: "); //allow user input to list
            String userItem = input.nextLine();

            if (isDuplicate(userItem, groceryList, count)) //if item entered by user is duplicate do not add to list
                System.out.println("Sorry, item: "+ userItem +" is a duplicate");
            else
                groceryList[count++] = userItem;//stops program after user has input max array values (6)
        }

            Arrays.sort(groceryList); //sorts array by alphabetical order
            System.out.println("Your Grocery List:");
            for (String i:groceryList) // for/each loop which searches through each element in list individually to reorder alphabetically
            {
                System.out.println(i);
            }
    }

    public static boolean isDuplicate(String item, String[] list, int listcnt) { //method for identifying duplicate entries into list

        for (int i = 0; i < listcnt; i++) // i has no value, the array list must have room to add values, and if added, the values are saved and the program counts the user input
        {
            if (item.equalsIgnoreCase(list[i]) ) //if an item meets all criteria listed in "for" above, it is considered true
            return true;
        }
        return false; //if item is a duplicate of what a user has already entered, if an item is already saved in the array, if the array capacity is full, value is false
    }
}
