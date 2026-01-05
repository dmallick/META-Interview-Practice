import java.util.Arrays;
/* 
https://leetcode.com/problems/move-zeroes/description/
Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.

Note that you must do this in-place without making a copy of the array.

Example 1:

Input: nums = [0,1,0,3,12]
Output: [1,3,12,0,0]


Example 2:

Input: nums = [0]
Output: [0]


*/
public class MoveZeros {
    
    // The solution is based on the 2 pointer approach. 2 points originally poiints to the same position and then if 
    //theere is NO zero in the nump[i], then copy that number to jth position but if there is Zero, then leave it. 
    //so, initially i & j point to first position which 0, but as the loop starts, there is no actions on array, 
    // but i move to second position point to value 2, but j still points to 0. Now, at next itteration, there is no
    //zero as i point to 2. and the swith happens leading {0,2} to {2,0} & the operations follows.
    
    public int[] moveZeros(int[] nums){
        int j=0, len=nums.length;
        for(int i=0; i<len; i++){
            if (nums[i] != 0) {
                nums[j] = nums[i];
                j++;
            }
        }
        System.out.println("L1 The value of J= " + j + " & nums = " + Arrays.toString(nums));
        while (j < nums.length) {
            nums[j] = 0;
            j++;
        }
        System.out.println("L2 The value of J= " + j + " & nums = " + Arrays.toString(nums));
        return nums;
    }

    public static void main(String[] args) {
        int[] nums = {0,2,7,0,1,0,0,3};
        MoveZeros mz = new MoveZeros();
        nums=mz.moveZeros(nums);
        System.out.println(Arrays.toString(nums));
    }
}
