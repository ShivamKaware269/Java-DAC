// Calculate Average Of N Numbers

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements : ");
        int n = sc.nextInt();

        int sum = 0;
        System.out.println("Enter " + n + " numbers :");
        for (int i = 0; i < n; i++) {
            sum = sum + sc.nextInt();
        }

        double average = (double) sum / n; // Type casting to get decimal value
        System.out.println("Average : " + average);

        sc.close();
    }
}
