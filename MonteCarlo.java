package MonteCarlo;
import java.util.*;

public class MonteCarlo {
	 public static void main(String[] args) {
	        Scanner scan = new Scanner(System.in);
	        System.out.println("Enter the number of traitors n: ");
	        int n = scan.nextInt();
	        int x = 1000000; // Number of simulation iterations
	        
	        scan.close();

	        // Count the number of wins for traitors
	        int traitorsWins = 0;
	        for (int i = 0; i < x; i++) {
	            if (simGame(n) == true) { // Run simulation for 1 iteration
	                traitorsWins++;
	            }
	        }

	        // Calculate the probability of traitors winning
	        double probability = (double) traitorsWins / x;

	        // Print the probability of traitors winning
	        System.out.println("Probability that traitors win: " + probability * 100 + "%");
	    }
	
	
	public static boolean simGame(int n) {
		int traitors = n;
		int faithful = 22 - n;
		
		Random random = new Random();
		
		
		while (faithful > 0 && traitors > 0 && (traitors + faithful) > 2) {
            // One faithful murdered.
            faithful--;

            // One person is voted out..
            if (random.nextInt(faithful + traitors) < traitors) { // Assuming traitors are more likely to vote cohesively.
                traitors--;
            } else {
                faithful--;
            }
        }

        // If a traitor is left.
        if (traitors > 0) {
            return true;
        }
	

    // If traitors = 0 after loop then faithful win.
    return false;
}
}