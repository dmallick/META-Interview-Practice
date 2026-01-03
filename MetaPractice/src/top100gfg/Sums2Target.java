package top100gfg;

import java.util.Arrays;

public class Sums2Target {
    public static void main(String[] args) {
        int targetedSum =6;
        int[] nums = {3,2,4};
        int[] finalnums = twoSum(nums, targetedSum);
       // System.out.println(Arrays.toString(finalnums));
    }

    private static int[] twoSum(int[] nums, int target) {
        int len = nums.length, k=0;
        int[] finalnums = {-1,-1};
        while ( k < len ) {
            int targetNum= target - nums[k];        
            for(int i=0; i< nums.length; i++){
                //System.out.println("The Sum Target is: " + target + " & nums[i]: " + nums[i] + " Searched Number: " + targetNum);
                if (targetNum == nums[i] && i!= k) {
                    System.out.println("Found !! The number is: " + nums[i]); 
                    finalnums[0] = i;
                    finalnums[1]=k;
                                System.out.println(i + "-" + k);

                    return finalnums;                 
                }
            }
            k++;
        }

        return finalnums;
    }
}
