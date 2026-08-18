// Program to find the sum of numbers upto N

import java.util.Scanner;

public class Sum_Of_N_Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, sum = 0;

        System.out.println("Enter a positive integer: ");
        n = sc.nextInt();

        for (int i = 1; i <= n; ++i) {
            sum += i;
        }

        System.out.println("Sum of first " + n + " natural numbers is: " + sum);

        sc.close();
    }
}
