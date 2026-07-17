// Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)

import java.util.Scanner;

public class Mini_Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number : ");
        int a = sc.nextInt();
        System.out.print("Enter the operator (+,-,*,/) :");
        char o = sc.next().charAt(0);
        System.out.print("Enter the Second number : ");
        int b = sc.nextInt();

        if (o == '+') {
            System.out.print("Addition : "+ (a+b));
        } else if (o == '-') {
            System.out.print("Subtraction : "+ (a-b));
        } else if (o == '*') {
            System.out.print("Subtraction : "+ (a*b));    
        } else if (o == '-') {
            System.out.print("Subtraction : "+ (a/b));    
        } else {
            System.out.println("Invalid operation");
        }

        sc.close();
    }
}

