// Volume of a pyramid = (1/3) * base area * height

import java.util.Scanner;

public class Pyramid_Volume {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the base area of the pyramid : ");
        float b = sc.nextFloat();
        System.out.print("Enter the height of the pyramid : ");
        float h = sc.nextFloat();

        System.out.println("The Volume of the pyramid : " + ((1.0 / 3) * b * h));

        sc.close();
    }
}

