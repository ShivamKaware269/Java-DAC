// Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.

import java.util.Scanner;

public class Simple_Intrest {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Principal amount :");
        int P = sc.nextInt();
        System.out.print("Enter the time period :");
        float T = sc.nextFloat();
        System.out.print("Enter the rate of intrest :");    
        float R = sc.nextFloat();

        float SI = (P*T*R)/100;

        System.out.println("The simple intrest would be : " + SI);

        sc.close();
    }
}

