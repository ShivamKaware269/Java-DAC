import java.util.Scanner;

public class Circumference {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the radius of the circle : ");
        double r = sc.nextDouble();

        double x = calc(r);

        System.out.println("The circumference of the circle is : " + x);

        sc.close();
    }

    static double calc(double r) {
        double circumference = 2 * Math.PI * r; // Math.PI is a constant that represents the value of π (pi)
        return circumference;
    }
}
