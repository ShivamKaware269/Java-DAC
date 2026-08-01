// Calculate Depreciation of Value

import java.util.Scanner;

public class Depreciation_Value {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the original value of the asset : ");
        double originalValue = sc.nextDouble();

        System.out.print("Enter the depreciation percentage at current time : ");
        double depreciationPercentage = sc.nextDouble();

        double depreciationAmount = (depreciationPercentage / 100) * originalValue;
        double finalValue = originalValue - depreciationAmount;

        System.out.println("Depreciation Amount : " + depreciationAmount);
        System.out.println("Final Value after Depreciation : " + finalValue);

        sc.close();
    }
}

