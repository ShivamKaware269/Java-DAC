// Perimeter of a Parallelogram

import java.util.Scanner;

public class Parallelogram_Perimeter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the base of the parallelogram : ");
        float b = sc.nextFloat();
        System.out.print("Enter the length of the side of the parallelogram : ");
        float s = sc.nextFloat();

        System.out.println("The Perimeter of the parallelogram : " + (2 * (b + s)) + " units");

        sc.close();
    }
}

