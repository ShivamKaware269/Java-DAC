// Write a Program to find whether the number is prime or not using methods(Functions)

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int number = sc.nextInt();

        int x = checkPrime(number);
        if (x == 1) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }

        sc.close();
    }

    static int checkPrime(int n) {
        if (n <= 1) {
            return 0;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) { // sqrt(n) is used for optimization, to decrease the number of iterations
            if (n % i == 0) {
                return 0;
            }
        }
        return 1;
    }
}
