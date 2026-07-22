// Perimeter of an Equilateral Triangle

import java.util.Scanner;

public class Equilateral_Triangle_Perimeter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the side of the equilateral triangle : ");
        float s = sc.nextFloat();

        System.out.println("The Perimeter of the equilateral triangle : " + (3 * s));

        sc.close();
    }
}

