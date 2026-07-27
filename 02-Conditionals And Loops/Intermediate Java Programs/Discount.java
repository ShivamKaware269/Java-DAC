// Calculate Discount Of Product

import java.util.Scanner;

public class Discount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the original price of the product : ");
        double originalPrice = sc.nextDouble();

        System.out.print("Enter the discount percentage : ");
        double discountPercentage = sc.nextDouble();

        double discountAmount = (discountPercentage / 100) * originalPrice;
        double finalPrice = originalPrice - discountAmount;

        System.out.println("Discount Amount : " + discountAmount);
        System.out.println("Final Price after Discount : " + finalPrice);

        sc.close();
    }
}

