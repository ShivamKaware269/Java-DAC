// Area Of Rhombus

import java.util.Scanner;

public class Rhombus_Area {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the first diagonal of the rhombus : ");
        float d1 = sc.nextFloat();
        System.out.print("Enter the length of the second diagonal of the rhombus : ");
        float d2 = sc.nextFloat();

        System.out.println("The Area of the rhombus : " + (0.5 * d1 * d2) + " sqm");

        sc.close();
    }
}

