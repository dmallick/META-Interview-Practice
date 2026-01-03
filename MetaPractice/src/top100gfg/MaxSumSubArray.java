package top100gfg;

/* https://leetcode.com/problems/maximum-subarray/description/
Given an integer array nums, find the subarray with the largest sum, and return its sum. */

public class MaxSumSubArray {
    public static void main(String[] args) {
        
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        int sum = findMaxSum(nums); 
        System.out.println("the max sum = " + sum);  
    }

    private static int findMaxSum(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        
        int currentSum = nums[0];
        int maxSum = nums[0];
        
        for (int i = 1; i < nums.length; i++) {
            // Either start new subarray at i, or extend previous subarray
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            // Update global maximum
            maxSum = Math.max(maxSum, currentSum);
        }
        
        return maxSum;
/*  Sliding window approach works, but there is an optimized way to handle this.      
        int sum=0, len = nums.length, maxSum=Integer.MIN_VALUE, i=0;
        while (i<len) {            
            sum=0;
            //System.out.println("Main loop: " + i);
            for(int j=i;j< len;j++){
                sum= sum + nums[j];

                if (maxSum< sum) {
                    maxSum=sum;
                    System.out.println("found a new high: " + maxSum);
                }
            }
            //System.out.println("The value of sum: " + sum + " for main loop "+i);

            i++;
        }         
        return maxSum;
 */      
        
    }
}
