import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public class MultiTierDiscount {
    public static void main(String[] args) {
        
        double purchaseAmount = 500.0;
        double discountPercent = 0.0;
        String discountTier = "No Discount";
        
        // Determine discount tier based on purchase amount
        if (purchaseAmount < 100) {
            discountPercent = 0.0;
            discountTier = "0% Discount";
        } else if (purchaseAmount < 300) {
            discountPercent = 5.0;
            discountTier = "5% Discount";
        } else if (purchaseAmount < 600) {
            discountPercent = 10.0;
            discountTier = "10% Discount";
        } else {
            discountPercent = 15.0;
            discountTier = "15% Discount";
        }
        
        // Calculate final price
        double discountAmount = purchaseAmount * (discountPercent / 100);
        double finalPrice = purchaseAmount - discountAmount;
        
    
        System.out.println("=== Multi-Tier Discount System ===");
        System.out.println("Purchase Amount: ₱" + purchaseAmount);
        System.out.println("Discount Tier:   " + discountTier);
        System.out.println("Discount Amount: ₱" + discountAmount);
        System.out.println("Final Price:     ₱" + finalPrice);
    }
}

/*
Programmer's Name: Ryan A. Monton
Course & Year: DIT 2-7
*/
    
}





