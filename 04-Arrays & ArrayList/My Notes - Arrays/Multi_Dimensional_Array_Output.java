import java.util.Arrays;
import java.util.Scanner;

public class Multi_Dimensional_Array_Output {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] Twod = new int[3][3]; //Array[row][col] -> hHre Array.length gives the no. of rows in array

        // Array[row].length gives the no. of elements in each row (No of elements and not values)

        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 3; j++) {
                System.out.print("Enter the element at position " + (i+1) + " " + (j+1) + " : ");
                Twod[i][j] = sc.nextInt();
            }
        }

        // Output Method 1
        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 3; j++) {
                System.out.print(Twod[i][j] + " ");
            }
            System.out.println();
        }

        // Output Method 2
        // for (int i = 0; i < Twod.length; i++) {
        //     System.out.println(Arrays.toString(Twod[3]));
        // }

        // Output Method 3
        for (int[] a : Twod) {
            System.out.println(Arrays.toString(a));
        }


        sc.close();
    }
}

