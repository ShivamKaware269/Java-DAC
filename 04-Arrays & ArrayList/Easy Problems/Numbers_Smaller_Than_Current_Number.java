import java.util.Arrays;

public class Numbers_Smaller_Than_Current_Number {
    public static void main(String[] args) {
        int[] nums = {8, 1, 2, 2, 3};

        
        int count = 0;
        int[] ans = new int[nums.length];

        for(int i = 0; i < nums.length; i++) {
            count = 0;
            for(int j = 0; j < nums.length; j++) {
                if(nums[j] < nums[i]) {
                    count++;
                }
            }
            ans[i] = count;
        }

        System.out.println(Arrays.toString(ans));
    }
}
