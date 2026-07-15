// Perimeter of Circle

import java.util.Scanner;

public class Circle_Perimeter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Select the dimensions \n1.Radius \n2.Diameter");
        System.out.print("Choice : ");
        int choice = sc.nextInt();
        float pi = 3.14f;
        
        if (choice == 1) {
            System.out.print("Enter the radius of the Circle : ");
            int rad = sc.nextInt();
            System.out.print("The perimeter of circle is : " + (2*pi*rad) + " units"); //Type casting
        } else if (choice == 2) {
            System.out.print("Enter the diameter of the Circle : ");
            int dia = sc.nextInt();
            System.out.print("The perimeter of circle is : " + (pi*dia) + " units"); //Type casting
        } else {
            System.out.print("Invalid choice");
        }

        sc.close();
    }
}

