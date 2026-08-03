// Compound Interest Java Program

import java.util.Scanner;

public class Compound_Intrest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int principal, time;
        double rate, amount, CI;

        System.out.println("Enter Principal amount : ");
        principal = sc.nextInt();

        System.out.println("Enter Time period : ");
        time = sc.nextInt();

        System.out.println("Enter Rate of Interest : ");
        rate = sc.nextDouble();

        // Calculate compound interest
        amount = principal * Math.pow((1 + rate / 100), time);
        CI = amount - principal;
        System.out.println("Compound Interest : " + CI);

        sc.close();
    }
}
