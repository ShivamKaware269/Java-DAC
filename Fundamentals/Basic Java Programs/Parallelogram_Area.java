// Area Of Parallelogram

import java.util.Scanner;

public class Parallelogram_Area {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the base of the parallelogram : ");
        float b = sc.nextFloat();
        System.out.print("Enter the perpendicular height of the parallelogram : ");
        float h = sc.nextFloat();

        System.out.println("The Area of the parallelogram : " + (b * h));

        sc.close();
    }
    
}
