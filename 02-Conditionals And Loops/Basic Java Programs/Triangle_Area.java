// Area Of Triangle

import java.util.Scanner;

public class Triangle_Area {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the height of the triangle : ");
        int h = sc.nextInt();
        System.out.print("Enter the base of the triangle : ");
        float b = sc.nextFloat();

        System.out.println("The Area of the triangle : " + (0.5*b*h) + " sqm"); //Type casting

        sc.close();
    }
}

