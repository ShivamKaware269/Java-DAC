// Leetcode - 1470

import java.util.Arrays;

public class Shuffle_The_Array {
    public static void main(String[] args) {
        
        int[] nums = {2,5,1,3,4,7};
        int[] ans = new int[nums.length];
        int mid = nums.length / 2;
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
                ans[i] = nums[count];
                count++;
            } else {
                ans[i] = nums[mid];
                mid++;
            }
        }

        System.out.println(Arrays.toString(ans));
    }
}
