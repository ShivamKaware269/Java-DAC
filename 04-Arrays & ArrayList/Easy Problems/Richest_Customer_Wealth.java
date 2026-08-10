// Leetcode - 1672

public class Richest_Customer_Wealth {
    public static void main(String[] args) {
        
        int candies[][] = {{1,5},{7,3},{5,3}};

        int richest = 0, indexi = 0, sum = 0;

        for(int i = 0; i < candies.length; i++) {
            sum = 0;
            for(int j = 0; j < candies[i].length; j++) {
                sum += candies[i][j];
            }
            if (sum > richest) {
                    richest = sum;
                    indexi = i;
            }
        }

        System.out.println("The richest customer is at index " + indexi + " and has wealth : " + richest) ;

    }   
}
