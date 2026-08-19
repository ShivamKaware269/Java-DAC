// Write a program to print the sum of negative numbers, sum of positive even numbers and positive odd numbers from a list of numbers entered by the user. The list terminates when the user enters zero (0)

import java.util.Scanner;

public class Sum_Of_Negative_PositiveEven_PositiveOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int condition = 1;
        int NegativeSum = 0, PositiveEven = 0, PositiveOdd = 0;

        while (condition == 1) {
            System.out.print("Enter the number or Enter 0 to terminate the program : ");
            int num = sc.nextInt();

            if (num == 0) {
                condition = 0;
                System.out.println("Program Terminated");
            } else if (num < 0) {
                NegativeSum += num;
            } else if (num % 2 == 0 && num > 0) {
                PositiveEven += num;
            } else if (num % 2 != 0 && num > 0) {
                PositiveOdd += num;
            }
        }

        System.out.println("Sum of all Negative numbers : " + NegativeSum);
        System.out.println("Sum of all Positive Even numbers : " + PositiveEven);
        System.out.println("Sum of all Positive Odd numbers : " + PositiveOdd);

        sc.close();
    }   
}
