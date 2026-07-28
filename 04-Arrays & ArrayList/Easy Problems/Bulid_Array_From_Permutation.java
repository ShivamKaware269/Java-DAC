import java.util.Arrays;
import java.util.Scanner;

public class Build_Array_From_Permutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[6];
        System.out.println("Enter array elements : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Initial : " + Arrays.toString(arr));

        int[] ans = new int[6];
        for (int i = 0; i < arr.length; i++) {
            ans[i] = arr[arr[i]];
        }

        System.out.println("Final : " + Arrays.toString(ans));

        sc.close();
    }
}
