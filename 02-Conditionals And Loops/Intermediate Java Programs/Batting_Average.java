// Calculate Batting Average

import java.util.Scanner;

public class Batting_Average {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the total runs scored : ");
        int totalRuns = sc.nextInt();

        System.out.print("Enter the number of innings played : ");
        int inningsPlayed = sc.nextInt();

        double battingAverage = (double) totalRuns / inningsPlayed; // Type casting to double for accurate average calculation

        System.out.println("Batting Average : " + battingAverage);

        sc.close();
    }
}

