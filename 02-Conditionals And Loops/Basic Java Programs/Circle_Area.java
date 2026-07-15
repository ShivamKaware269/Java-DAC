// Area Of Circle Java Program

import java.util.Scanner;

public class Circle_Area {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Select the dimensions \n1.Radius \n2.Diameter");
        System.out.print("Choice : ");
        int choice = sc.nextInt();
        float pi = 3.14f;

        if (choice == 1) {
            System.out.print("Enter the radius of the Circle : ");
            int rad = sc.nextInt();
            System.out.print("The area of circle is : " + (pi*rad*rad) + " sq.m"); //Type casting
        } else if (choice == 2) {
            System.out.print("Enter the diameter of the Circle : ");
            int dia = sc.nextInt();
            System.out.print("The area of circle is : " + (pi*(dia/2)*(dia/2)) + " sq.m"); //Type casting
        } else {
            System.out.print("Invalid choice");
        }
        
        sc.close();
    }
    
}
