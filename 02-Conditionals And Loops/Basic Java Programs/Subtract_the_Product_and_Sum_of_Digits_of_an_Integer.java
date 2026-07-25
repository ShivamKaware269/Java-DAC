// Subtract the Product and Sum of Digits of an Integer

import java.util.Scanner;

public class Subtract_the_Product_and_Sum_of_Digits_of_an_Integer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the desired number : ");
        int n = sc.nextInt();

        int sum = 0, product = 1, last_digit = 0;

        while (n != 0) {

            last_digit = n % 10;
            sum = sum + last_digit;
            product = product * last_digit;
            n = n / 10;

        }

        System.out.println( "The sum of the digits is : " + sum );
        System.out.println( "The product of the digits is : " + product );
        int subtract = product - sum;
        System.out.println( "The Subtraction od the Product and Sum of Digits of above Integer is : " + subtract );

        sc.close();
    }
}

