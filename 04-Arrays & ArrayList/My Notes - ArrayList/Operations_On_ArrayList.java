import java.util.ArrayList;
import java.util.Scanner;

public class Multi_Dimensional_ArrayList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>(); // Declaration of 2D arraylist

        // We need to first enter few elements in arraylist in order to get some in it
        for (int i = 0; i < 3; i++) {
            matrix.add(new ArrayList<>()); // Creating Input space for elements into 2D array
        }

        // as i = j = 3 its a (3x3) matrix / 2D arraylist
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Enter the element at " + i + " " + j + " : " ); 
                matrix.get(i).add(sc.nextInt()); // Inputting the elements
            }
        }

        System.out.println(matrix);

        sc.close();
    }
}

