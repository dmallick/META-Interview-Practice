import java.util.Arrays;

/*
https://leetcode.com/problems/rotate-array/submissions/1872010544/
Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.

Example 1:
Input: nums = [1,2,3,4,5,6,7], k = 3
Output: [5,6,7,1,2,3,4]
Explanation:
rotate 1 steps to the right: [7,1,2,3,4,5,6]
rotate 2 steps to the right: [6,7,1,2,3,4,5]
rotate 3 steps to the right: [5,6,7,1,2,3,4]

Example 2:
Input: nums = [-1,-100,3,99], k = 2
Output: [3,99,-1,-100]
Explanation: 
rotate 1 steps to the right: [99,-1,-100,3]
rotate 2 steps to the right: [3,99,-1,-100]


*/

public class ArrayRotation {
    
     public static int[] rotate(int[] nums, int rb){
        //rb = rotate by; len lenth of array; reverse() to reverse the array
        //nums = [1,2,3,4,5,6,7], rb = 3
        int len=nums.length;
        rb = rb % len;  // rb=2, len=7;
        reverse(nums, 0, len-1); //0, 6
        reverse(nums, 0, rb-1);  // 0, 2
        nums = reverse(nums, rb, len-1);

        return nums;
    }

    public static int[] reverse(int[] nums, int start, int end){
        int temp;
        while (start < end) {
            temp=nums[start]; //temp=1; 
            nums[start]=nums[end];
            nums[end]=temp;
            start++;
            end--;
        }

        return nums;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
        System.out.println("Before reversing array: " + Arrays.toString(nums) + "  by positions: " + 3);        
        nums= rotate(nums, 3);

        System.out.println("After the reverse: " + Arrays.toString(nums) + "  by positions: " + 3);

    }
    
}
