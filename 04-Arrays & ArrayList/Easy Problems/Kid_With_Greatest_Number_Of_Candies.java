// Leetcode - 1431

import java.util.ArrayList;

public class Kid_With_Greatest_Number_Of_Candies {
    public static void main(String[] args) {
        int[] candies = {2,3,5,1,3};
        int extraCandies = 3;
        int sum = 0, max = 0;

        ArrayList<Boolean> answer = new ArrayList<>();

        for (int i = 0; i < candies.length; i++) {
            if (max < candies[i]) {
                max = candies[i];
            }
        }
        System.out.println(max);
 
        for (int i = 0; i < candies.length; i++) {
            sum = 0;
            sum = candies[i] + extraCandies;

            if (sum >= max) {
                answer.add(true);
            } else {
                answer.add(false);
            }

        }

        System.out.println(answer);

    }
}
