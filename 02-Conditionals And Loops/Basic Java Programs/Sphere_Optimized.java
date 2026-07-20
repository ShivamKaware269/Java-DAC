// Volume of Sphere Optimized

import java.util.Scanner;

public class Sphere_Optimized {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Select the dimensions \n1.Radius \n2.Diameter");
        System.out.print("Choice : ");
        int choice = sc.nextInt();
        float pi = 3.14f;

        if (choice == 1) {
            System.out.print("Enter the radius of the Sphere : ");
            int rad = sc.nextInt();
            System.out.print("The volume of sphere is : " + ((4.0 / 3) * pi * rad * rad * rad) + " cu.m"); //Type casting
        } else if (choice == 2) {
            System.out.print("Enter the diameter of the Sphere : ");
            int dia = sc.nextInt();
            System.out.print("The volume of sphere is : " + ((4.0 / 3) * pi * (dia / 2) * (dia / 2) * (dia / 2)) + " cu.m"); //Type casting
        } else {
            System.out.print("Invalid choice");
        }
        sc.close();
    }
}

