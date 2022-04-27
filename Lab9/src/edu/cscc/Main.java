package edu.cscc;

import java.io.*;
import java.sql.PseudoColumnUsage;
import java.util.Arrays;
import java.util.Formatter;
import java.util.Scanner;

/**
 * Program that reads "components.txt" file, and uses String split criteria, "," to separate file contents into three columns that conform to a specified print format.
 * @author Laura Rapp, 11/09/21
 */
public class Main {
    static final String INPUTFILE = "components.txt";
    static final String PRINTFFORMAT = "%20s %2d    %6.2f\n";

    public static void main(String[] args) {
    	double total = 0;
	    File infile = new File(INPUTFILE);
	    System.out.printf("%s%n","           Component Units Price");

        String txtFile;
        try (
	        BufferedReader br = new BufferedReader(new FileReader(new File(INPUTFILE)));
        ) {
            while ((txtFile = br.readLine()) !=null) {

                String[] compTxt = txtFile.split(",");

                int units = Integer.parseInt(compTxt[1]);
                double prices = Double.parseDouble(compTxt[2]);
                total += units*prices;
                System.out.printf(PRINTFFORMAT, compTxt[0], units, prices);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
                System.out.println("File not found");
        }
        System.out.println("Total cost: "+total);
    }

}
