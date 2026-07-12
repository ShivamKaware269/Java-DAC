// Area Of Equilateral Triangle

import java.util.Scanner;

public class Equilateral_Triangle_Area {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the side of the equilateral triangle : ");
        float a = sc.nextFloat();

        System.out.println("The Area of the equilateral triangle : " + ((Math.sqrt(3)/4)*a*a) + " sq.m");

        sc.close();
    }
}

