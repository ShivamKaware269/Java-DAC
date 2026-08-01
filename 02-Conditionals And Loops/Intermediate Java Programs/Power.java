// Power In Java

import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the base number : ");
        double base = sc.nextDouble();

        System.out.print("Enter the exponent : ");
        double exponent = sc.nextDouble();

        double result = Math.pow(base, exponent); // Power calculation using Math.pow() method

        System.out.println(base + " raised to the power of " + exponent + " is : " + result);

        sc.close();
    }
}

