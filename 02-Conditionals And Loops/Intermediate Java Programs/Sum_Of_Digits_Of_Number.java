import java.util.Scanner;

public class Sum_Of_Digits_Of_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();
        int DigiSum = 0, rem = 0;

        while (num != 0) {
            rem = num % 10;
            DigiSum += rem;
            num /= 10;
        }

        System.out.println("The sum of the digits is : " + DigiSum);

        sc.close();
    }
}
