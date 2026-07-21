// Perimeter of Rhombus

import java.util.Scanner;   

public class Rhombus_Perimeter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the side of the rhombus : ");
        float s = sc.nextFloat();

        System.out.println("The Perimeter of the rhombus : " + (4 * s));

        sc.close();
    }
}

