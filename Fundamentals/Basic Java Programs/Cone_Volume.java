// Volume of cone

import java.util.Scanner;

public class Cone_Volume {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of the cone : ");
        float r = sc.nextFloat();
        System.out.print("Enter the height of the cone : ");
        float h = sc.nextFloat();

        float pi = 3.14f;

        float volume = (1/3)*pi*r*r*h;

        System.out.println("The volume of the cone : " + volume + " cu.unit");

        sc.close();
    }
}

