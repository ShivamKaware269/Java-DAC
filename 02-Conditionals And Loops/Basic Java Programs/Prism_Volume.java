// Volume Of Prism

import java.util.Scanner;

public class Prism_Volume {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the base area of the prism : ");
        float b = sc.nextFloat();
        System.out.print("Enter the height of the prism : ");
        float h = sc.nextFloat();

        System.out.println("The Volume of the prism : " + (b * h) + " cu.units");

        sc.close();
    }
}
