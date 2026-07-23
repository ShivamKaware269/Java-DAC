// Fibonacci Series In Java Programs

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of terms for the Fibonacci series : ");
        int n = sc.nextInt();

        int a = 0, b = 1, c;
        System.out.print("The Fibonacci series is : ");

        for (int i = 1; i <= n; i++) {
            if (i == 1) {
                System.out.print(a + " ");
            } else if (i == 2) {
                System.out.print(b + " ");
            } else {
                c = a + b;
                System.out.print(c + " ");
                a = b;
                b = c;
            }
        }
        sc.close();
    }
}

