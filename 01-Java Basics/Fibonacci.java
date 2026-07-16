// To calculate Fibonacci Series up to n numbers.

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the term number in Fibonacci Series : ");
        int term = sc.nextInt();

        int a = 0, b = 1, c = 0;

        if (term == 1) {
            System.out.println("Fibonacci Term :" + term);
        } else if (term == 2) {
            System.out.println("Fibonacci Term :" + term); 
        } else {
            for (int i = 0; i < term; i++) {
                c = a + b;
                a = b;
                b = c;
            }
            System.out.println("Fibonacci Term : " + c);
        }
        sc.close();
    }
}
