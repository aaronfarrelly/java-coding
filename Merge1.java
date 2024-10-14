package Merging;
import java.util.*;

public class Merge1 {
    // Method to merge two strings character by character
    public static String mergeStrings(String word1, String word2) {
        StringBuilder merged = new StringBuilder();
        int i = 0, j = 0;
        
        // Loop through both strings until one is exhausted
        while (i < word1.length() || j < word2.length()) {
            // Append character from word1 if available
            if (i < word1.length())
                merged.append(word1.charAt(i++));
            // Append character from word2 if available
            if (j < word2.length())
                merged.append(word2.charAt(j++));
        }
        
        return merged.toString(); // Return the merged string
    }

    
    public static void main(String[] args) {
    	Scanner scan = new Scanner(System.in);
    	
        String word1 = scan.nextLine();
        String word2 = scan.nextLine();
        System.out.println(mergeStrings(word1, word2)); // Output: "apbqcr"
    }
}

