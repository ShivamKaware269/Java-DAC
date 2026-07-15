// Volume Of Sphere

import java.util.Scanner;

public class Sphere_Volume {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of the sphere : ");
        float r = sc.nextFloat();

        System.out.println("The Volume of the sphere : " + ((4.0 / 3) * Math.PI * Math.pow(r, 3))); 
        // USE of Math.PI and Math.pow() methods to calculate the volume of the sphere

        sc.close();
    }
}

