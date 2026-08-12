// Make a program to take integer inputs  from the user until the user enters 0.
// Perform required operations on all the input numbers and print the sum of all the numbers.

import java.util.Scanner;

public class All_Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = 1, sum = 0;

        while (t == 1) {

            System.out.print("Enter the number and to stop Enter '0' : ");
            int x = sc.nextInt();
            
            if (x == 0) {
                break;
            } else {
                sum = sum + x;
            }

        }
        System.out.println("The sum of all the numbers is : " + sum);
        sc.close();
    }
}
