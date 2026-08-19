// Write a program to find whether the person is eligible for voting or not using methods (Functions)

import java.util.Scanner;

public class Voting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter your age : ");
        int age = sc.nextInt();

        int x = check(age);
        if (x == 1) {
            System.out.println("Candidate is eligible for voting");
        } else {
            System.out.println("Candidate is not eligible for voting");
        }
        sc.close();
    }

    static int check(int age) {
        if (age >= 18) {
            return 1;
        } else {
            return 0;
        }
    }
}
