// Calculate average marks of all subjects

import java.util.Scanner;

public class Average_Marks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of subjects: ");
        int numSubjects = sc.nextInt();
        int sum = 0;
        double average;

        System.out.println("Enter marks for each subject: ");
        for (int i = 0; i < numSubjects; i++) {
            sum += sc.nextInt();
        }

        average = (double) sum / numSubjects;
        System.out.println("Average marks: " + average);

        sc.close();
    }
}

