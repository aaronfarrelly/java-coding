package Calculator;
import java.util.*;

public class InterestCalc {
    public static void main(String[] args) {
        // Create a scanner object to read user input
        Scanner scan = new Scanner(System.in);
        
        // Prompt the user to enter loan amount, annual interest rate, and monthly payment amount
        double loan = scan.nextDouble();
        double interest = scan.nextDouble();
        double amount = scan.nextDouble();
        
        // Calculate the time (number of months) required to pay off the loan
        int time = loanLength(loan, interest, amount);
        
        // Print the calculated time (number of months)
        System.out.println(time);
        
    }

    // Method to calculate the time (number of months) required to pay off the loan
    public static int loanLength(double loan, double interest, double amount) {
        // Base case: If the loan amount is zero or negative, return 0 (loan fully paid off)
        if (loan <= 0) {
            return 0;
        } else {
            // Calculate the monthly interest amount
            double monthlyInterest = loan * interest / 12;
            
            // Calculate the remaining balance after deducting the monthly payment amount
            double remainingBalance = loan + monthlyInterest - amount;
            
            // Recursively call loanLength method with the remaining balance and increment the result by 1
            return 1 + loanLength(remainingBalance, interest, amount);
        }
    }
}

