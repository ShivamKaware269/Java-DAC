// Take name as input and print a greeting message for that particular name.

import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name");

        String name = sc.next();

        System.out.println("Hello " + name + " !! Great to see you here");
        
        sc.close();
    }
}

