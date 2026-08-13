import java.util.Arrays;

public class Remove_Duplicates_From_The_Sorted_Array {
    public static void main(String[] args) {
        int[] arr = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int i = 0, j = 0;

        while (j < arr.length) {
            if (arr[j] != arr[i]) {
                i++;
                arr[i] = arr[j];
            }
            j++;
        }

        System.out.println("Initial " + (i+1) + " elements are unique elements present in the array :");
        System.out.println(Arrays.toString(arr));

    }
}
