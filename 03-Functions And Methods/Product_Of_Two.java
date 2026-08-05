// A program to calculate the product of the two numbers using methods (Functions)

import java.util.Scanner;

public class Product_Of_Two {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number 1 : ");
        int a = sc.nextInt();
        System.out.print("Enter the number 2 : ");
        int b = sc.nextInt();

        int x = calc(a, b);

        System.out.println("The product of " + a + " and " + b + " is: " + x);

        sc.close();
    }

    static int calc(int a, int b) {
        int product = a * b;
        return product;
    }
}
