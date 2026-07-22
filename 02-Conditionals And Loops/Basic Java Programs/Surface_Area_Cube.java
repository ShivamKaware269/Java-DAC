// Total surface area of a cube is 6 * side * side

import java.util.Scanner;

public class Surface_Area_Cube {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the side of the cube : ");
        float s = sc.nextFloat();

        System.out.println("The Total Surface Area of the cube : " + (6 * s * s));

        sc.close();
    }
}

