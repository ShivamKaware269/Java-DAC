import java.util.Scanner;

public class Mutli_Dimensional_Array {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int[][] TwoDimensional = new int[3][3];

        // Input
        for (int i = 0; i < TwoDimensional.length; i++) {

            for (int j = 0; j < TwoDimensional.length; j++) {
                System.out.print("Enter the element at position " + (i+1) + " " + (j+1) + " : ");
                TwoDimensional[i][j] = sc.nextInt();
            }

        }

        System.out.println("The output is : ");

        // Output
        for (int i = 0; i < TwoDimensional.length; i++) {

            for (int j = 0; j < TwoDimensional.length; j++) {
                System.out.print(TwoDimensional[i][j] + " ");
            }

            System.out.println();

        }

        sc.close();

    }
}

