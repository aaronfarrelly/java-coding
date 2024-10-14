package Collatz;
import java.util.*;

public class CollatzConjecture {
     public static void main(String[] args) {
            int limit = 10000; // Limit up to which we check numbers
            int maxSteps = 0;  // Variable to track the maximum steps found
            int startNumber = 1000;  // Starting number of the largest group of numbers
            int currentSteps = 0;  // Variable to store the steps for the current number
            int currentNumber;  // Variable to store the current number being processed

            // Loop through all numbers from 1 to the limit
            for (int i = 1; i <= limit; i++) {
                currentNumber = i;  // Assign current number
                currentSteps = findSteps(currentNumber);  // Calculate steps for the current number

                // Check if current number of steps is greater than the maximum found
                if (currentSteps > maxSteps) {
                    maxSteps = currentSteps;  // Update max steps if a higher number of steps is found
                    startNumber = i - currentSteps; // Update the starting number of the largest group
                }
            }

            // Print the largest group of numbers with the same amount of steps
            System.out.println("The largest group of numbers with the same amount of steps is:");
            for (int i = startNumber; i < startNumber + maxSteps; i++) {
                System.out.println(i + " ");  // Print each number in the group
            }
            System.out.println("Number of steps: " + maxSteps);  // Print the maximum number of steps
        }

    // Method to find the number of steps in the Collatz sequence for a given number
    public static int findSteps(int x) {
        int count = 0;  // Counter to keep track of the steps

        // Continue the loop until the number becomes 1
        while (x > 1) {
            if (x % 2 == 0) {  // If the number is even, divide by 2
                x = x / 2;
            } else {  // If the number is odd, multiply by 3 and add 1
                x = (x * 3) + 1;
            }
            count++;  // Increment the step count
        }
        return count;  // Return the total number of steps
    }
}
