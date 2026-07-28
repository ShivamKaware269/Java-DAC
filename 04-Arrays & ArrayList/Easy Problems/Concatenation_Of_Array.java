// Concatenation of Array problem (LeetCode 1929)

import java.util.Arrays;
import java.util.Scanner;

public class Concatenation_Of_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int s = arr.length;
        int[] conc = new int[2 * s];
        
        for (int i = 0; i < s; i++) {
            conc[i] = arr[i];
            conc[i + s] = arr[i];
        }

        System.out.println("Concatenated Array:" + Arrays.toString(conc));

        sc.close();
    }
    
}
