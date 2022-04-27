package edu.cscc;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Objects;
import java.io.File;
import java.util.Set;
import java.util.TreeSet;

/**
 * Utility to process a document to into sorted set of unique words
 * Laura Rapp, 12/6/21
 */
public class UniqueWords {
    /**
     * Read file one line at a time
     * Break input String into words
     * Store unique words sorted into alphabetic order
     * @param myfile input file
     * @return sorted set of unique words
     */
    public static Set<String> processDocument(File myfile) {
        // TODO - Implement this method to read the file one line at a time
        // and return a Set of sorted unique words. Choose the correct Collection
        // type to handle a sorted unique set of words. You will need to make use
        // of the tokenize() method below.
        TreeSet<String> sortedWords = new TreeSet<>();
        try (BufferedReader br = new BufferedReader(new FileReader(myfile))) {

            String oneLine;
            while ((oneLine = br.readLine()) != null) {
                if (oneLine.length() > 0) {
                    String tok[] = tokenize(oneLine);
                    for (String compareStr : tok) {
                        if (Objects.nonNull(compareStr) && ! "".equals(compareStr) && ! "".equals(compareStr))
                            sortedWords.add(compareStr);
                    }
                }
            }
        } catch (Exception ex) {
            System.out.println ("Error");
        }
        return sortedWords;

    }

    /**
     * Remove all punctuation and numbers from String
     * Tokenize - break into individual words
     * Convert all words to lower case
     * @param str initial non-null String
     * @return array of words from initial String
     */
    public static String[] tokenize(String str) {
        str = str.replaceAll("[^a-zA-Z \n]"," ");
        String[] tok = str.split(" ");
        for (int i=0; i<tok.length; ++i) {
            tok[i] = tok[i].toLowerCase();
        }
        return tok;
    }
}
