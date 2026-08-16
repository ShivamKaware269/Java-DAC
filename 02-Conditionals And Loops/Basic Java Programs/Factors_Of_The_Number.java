// Take the input as a number and print all the factors existing of that number.

import java.util.Scanner;

public class Factors_Of_The_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();

        System.out.print("The factors of the given number are : ");

        for (int i = 1; i <= n; i++) {

            if (n % i == 0) {
                System.out.print(i + " ");
            }

        }
        sc.close();
    }
}

