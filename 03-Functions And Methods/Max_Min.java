// Define two methods to print the maximum and the minimum number respectively among three numbers entered by the user using methods.

import java.util.Scanner;

public class Max_Min {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();

        System.out.print("Enter the third number: ");
        int num3 = sc.nextInt();

        int max = findMax(num1, num2, num3);
        int min = findMin(num1, num2, num3);

        System.out.println("The maximum number is: " + max);
        System.out.println("The minimum number is: " + min);
        
        sc.close();
    }

    static int findMax(int a, int b, int c) {
        int max = a;
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        return max;
    }

    static int findMin(int a, int b, int c) {
        int min = a;
        if (b < min) {
            min = b;
        }
        if (c < min) {
            min = c;
        }
        return min;
    }
}
