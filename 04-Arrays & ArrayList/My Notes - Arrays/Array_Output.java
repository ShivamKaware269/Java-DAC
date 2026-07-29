import java.util.Arrays;

public class Array_Output {
    public static void main(String[] args) {
        
        int[] Array = { 9, 5, 2, 6, 3, 7};

        // 1.Simple for loop output
        for (int i = 0; i < Array.length; i++) {
            System.out.print( Array[i] + " ");
        }

        System.out.println();

        // 2.For each loop (iterating each element in the array through "i")
        for (int i : Array) {
            System.out.print(i + " ");
        }

        System.out.println();

        // 3.Using the Array class (Most preferable)
        System.out.println(Arrays.toString(Array)); // Converts the array into string and prints in array format

        // We can change the value of a particular index as : Array[2] = 35;
        // Arrays are mutable

    }
}

