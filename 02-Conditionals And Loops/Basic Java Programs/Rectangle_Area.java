// Area Of Rectangle Program

import java.util.Scanner;

public class Rectangle_Area {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the rectangle : ");
        int l = sc.nextInt();
        System.out.print("Enter the bredth of the rectangle : ");
        float b = sc.nextFloat();

        System.out.println("The Area of the rectangle : " + (b*l) + " sq.m"); //Type casting

        sc.close();
    }
}


