// Take 2 numbers as input and print the largest number.

import java.util.Scanner;

public class Largest_Of_Two {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number : ");
        int a = sc.nextInt();
        System.out.print("Enter the second number : ");
        int b = sc.nextInt();

        if (a>b) {
            System.out.println("Largest : " + a);  
        } else {
            System.out.println("Largest : " + b);       
        }

        sc.close();
    }
}

