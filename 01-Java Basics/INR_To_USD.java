// Program to convert input currency of rupees into USD.

import java.util.Scanner;

public class INR_To_USD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        System.out.print("Enter the value in rupees : ");
        int inr = sc.nextInt();
        double usd = 0.011; //As of on 9-Aug-2026

        System.out.println("The value in dollar is " +  (inr * usd));

        sc.close();
    }    
}
