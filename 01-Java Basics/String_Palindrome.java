// To find out whether the given String is Palindrome or not.

import java.util.Scanner;

public class String_Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String str = sc.nextLine();
        String rev = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }
        System.out.println("The reverse of String is : " + rev);

        if (str.equals(rev)) {
            System.out.println("String is Palindrome");
        } else {
            System.out.println("String is not a Palindrome");
        }

        sc.close();
    }
}

