// Calculate CGPA Java Program

import java.util.Scanner;

public class Cgpa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of subjects: ");
        int numSubjects = sc.nextInt();

        double totalMarks = 0;

        for (int i = 1; i <= numSubjects; i++) {
            System.out.print("Enter grade obtained in subject " + i + ": ");
            double marks = sc.nextDouble();
            totalMarks += marks;
        }

        double cgpa = totalMarks / numSubjects;

        System.out.println("Your CGPA is: " + cgpa);

        sc.close();
    }
    
}

