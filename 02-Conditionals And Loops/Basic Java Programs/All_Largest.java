// Take integer inputs till the user enters 0 and print the largest number from all.

import java.util.Scanner;

public class All_Largest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = 1, largest = 0;

        while (t == 1) {

            System.out.print("Enter the number and to stop Enter '0' : ");
            int x = sc.nextInt();
            

            if (x == 0) {
                break;
            } else {
                if (x > largest) {
                    largest = x;
                }
            }


        }
        System.out.println("The largest of all the numbers is : " + largest);

        sc.close();
    }
}


