import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;

class Codechef
{
    public class NestedLoginValidator {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        // Correct credentials
        String correctUsername = "ADMIN";
        String correctPassword = "RAM101226";
        boolean accountIsLocked = false;
        
        // Ask the user for their credentials
        System.out.println("=== Login System ===");
        System.out.print("Enter Username: ");
        String inputUsername = input.nextLine();
        
        System.out.print("Enter Password: ");
        String inputPassword = input.nextLine();
        
        System.out.print("Is your account locked? (true/false): ");
        boolean inputLockedStatus = input.nextBoolean();
        
        System.out.println(); 
        
        // Level 1: Check username first
        if (inputUsername.equals(correctUsername)) {
            
            // Level 2: Only check password if username matches
            if (inputPassword.equals(correctPassword)) {
                
                // Level 3: Only check account status if both match
                if (!inputLockedStatus && !accountIsLocked) {
                    System.out.println("Login Successful :) \n Welcome!");
                } else {
                    System.out.println("Login Failed: Account is locked. Please contact support.");
                }
            } else {
                System.out.println("Login Failed: Incorrect password.");
            }
        } else {
            System.out.println("Login Failed: Username not found.");
        }
        
        input.close();
    }
}

/*
Programmer's Name: Ryan A. Monton
Course & Year: DIT 2-7
*/
}
