// Leetcode - 136

public class Single_Number {
    public static void main(String[] args) {
        int[] arr = {4, 1, 4, 2, 2};
        int result = 0;

        // Using XOR Operator

        for (int i : arr) {
            result ^= i;
        }

        System.out.println("The unique element in the array is : " + result);

    }
}
