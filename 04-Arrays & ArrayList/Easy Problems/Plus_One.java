import java.util.Arrays;

public class Plus_One {
    public static void main(String[] args) {
        int[] array = {1, 5, 7};

        System.out.println(array[array.length - 1]);

        if (array[array.length - 1] != 9) {
            array[array.length - 1] += 1;
        }

        for (int i = array.length - 1; i > 0; i--) {
            
            if (array[i] == 9) {
                array[i] = 0;
                array[i - 1] += 1;
            }
        }

        System.out.println(array[array.length - 1]);

        System.out.println(Arrays.toString(array));

    }
}
