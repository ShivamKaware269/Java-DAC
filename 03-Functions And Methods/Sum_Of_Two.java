// Write a program to find out the sum of two numbers using methods (Functions)

import java.util.Scanner;

public class Sum_Of_Two {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number 1 : ");
        int a = sc.nextInt();
        System.out.print("Enter the number 1 : ");
        int b = sc.nextInt();

        print(a, b);

        sc.close();
    }

    static void print(int a, int b) {
        int sum = a + b;
        System.out.println("The sum of " + a + " and " + b + " is: " + sum);
    }
}
