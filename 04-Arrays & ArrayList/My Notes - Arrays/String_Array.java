import java.util.Arrays;
import java.util.Scanner;

public class String_Array {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
       
        String[] name = new String[5];

        for (int i = 0; i < name.length; i++) {
            System.out.print("Enter the name at position " + (i+1) + " : ");
            name[i] = sc.next();
        }

        System.out.println("The output is : "+ Arrays.toString(name) );

        sc.close();
    }
}

