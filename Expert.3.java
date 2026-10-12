import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;

class Codechef
{
    public class ATMTransaction {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        // Correct login info
        String validUsername = "Ry_Mon";
        int validPin = 1234;
        
        // Account details
        String accountTier = "Gold";  
        // Bronze, Silver, Gold, Platinum
        double balance = 7000.0;
        
        System.out.println("=== ATM Transaction Authorizer ===");
        
        // User login credentials
        System.out.print("Enter Username: ");
        String inputUser = input.nextLine();
        
        System.out.print("Enter 4-digit PIN: ");
        int inputPin = input.nextInt();
        
        System.out.print("Enter withdrawal amount: ");
        double withdrawalAmount = input.nextDouble();
        
        System.out.println(); // blank line
        
        // Step 1: Check username & PIN first
        if (inputUser.equals(validUsername) && inputPin == validPin) {
            System.out.println("Login verified: " + accountTier + " Account");
            
            // Step 2: Determine daily limit and fee based on tier
            double feePercent = 0.0;
            double tierLimit = 0.0;
            
            if (accountTier.equals("Bronze")) {
                tierLimit = 500.0;
                feePercent = 2.0;
            } else if (accountTier.equals("Silver")) {
                tierLimit = 800.0;
                feePercent = 1.5;
            } else if (accountTier.equals("Gold")) {
                tierLimit = 1500.0;
                feePercent = 1.0;
            } else if (accountTier.equals("Platinum")) {
                tierLimit = 3000.0;
                feePercent = 0.0;
            }
            
            // Step 3: Check withdrawal conditions
            if (withdrawalAmount <= balance) {
                if (withdrawalAmount <= tierLimit) {
                    
                    // Calculate fee using switch
                    double fee = 0.0;
                    switch(accountTier) {
                        case "Bronze": fee = withdrawalAmount * 0.02; break;
                        case "Silver": fee = withdrawalAmount * 0.015; break;
                        case "Gold": fee = withdrawalAmount * 0.01; break;
                        case "Platinum": fee = 0.0; break;
                    }
                    
                    double totalDeduction = withdrawalAmount + fee;
                    
                    if (totalDeduction <= balance) {
                        System.out.println("TRANSACTION APPROVED!");
                        System.out.println("Withdrawal:  " + withdrawalAmount);
                        System.out.println("Service Fee (" + feePercent + "%):  " + fee);
                        System.out.println("Total Deduction:  " + totalDeduction);
                        System.out.println("Remaining Balance: " + (balance - totalDeduction));
                    } else {
                        System.out.println("DENIED: Insufficient balance to cover withdrawal + service fee.");
                    }
                } else {
                    System.out.println("DENIED: Amount exceeds daily withdrawal limit of " + tierLimit);
                }
            } else {
                System.out.println(" DENIED: Insufficient account balance.");
            }
        } else {
            if (!inputUser.equals(validUsername)) {
                System.out.println("DENIED: Username not recognized.");
            } else {
                System.out.println("DENIED: PIN does not match.");
            }
        }
        
        input.close();
    }
}

/*
Programmer's Name: Ryan A. Monton
Course & Year: DIT 2-7
*/
    
}
