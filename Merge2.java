package Merging;
import java.util.*;

public class Merge2 {
    // Method to merge two sorted strings alphabetically
    public static String mergeSortedStrings(String word1, String word2) {
        StringBuilder merged = new StringBuilder();
        int i = 0, j = 0;
        
        // Iterate through both strings simultaneously
        while (i < word1.length() && j < word2.length()) {
            // Compare characters at current positions
            if (word1.charAt(i) <= word2.charAt(j))
                // Append the smaller character to the merged string and advance the pointer
                merged.append(word1.charAt(i++));
            else
                merged.append(word2.charAt(j++));
        }
        
        // Append remaining characters from word1, if any
        while (i < word1.length())
            merged.append(word1.charAt(i++));
        
        // Append remaining characters from word2, if any
        while (j < word2.length())
            merged.append(word2.charAt(j++));
        
        // Return the merged string
        return merged.toString();
    }
    
    public static void main(String[] args) {
        // Test case
    	Scanner scan = new Scanner(System.in);
    	
        String word1 = scan.nextLine();
        String word2 = scan.nextLine();
        System.out.println(mergeSortedStrings(word1, word2)); // Output: "abcdefghij"
    }
}

