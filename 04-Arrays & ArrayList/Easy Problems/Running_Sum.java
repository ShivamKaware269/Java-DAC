import java.util.Arrays;

public class Running_Sum {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(Arrays.toString(a));
        int sum = 0;

        for (int i = 1; i < a.length; i++) {
            sum = a[i] + a[i-1];
            a[i] = sum;
        }

        System.out.println(Arrays.toString(a));
    }
}

