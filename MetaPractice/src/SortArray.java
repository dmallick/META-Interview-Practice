//https://leetcode.com/problems/sort-an-array/description/

import java.util.Arrays;

public class SortArray {
    

    public static void main(String[] args) {
        int[] nums={7,3,12,76,33,7};
        int[] op = sortArray(nums);    
    }

    private static int[] sortArray(int[] nums) {
        int len = nums.length;
        int i=1, j=0, k=1;
        while (k <= len) {  
            System.out.println("The Value of k and len:  " + k + "  " + len);     
            for(i=1, j=0; i<len; i++, j++){
                System.out.println("The Value of i and j:  " + i + "  " + j);     
                if (nums[i] < nums[j]) {
                    swap(nums, i, j);                    
                    //j++;
                }
            }
            System.out.println("After round: " + k + " the array stands as " + Arrays.toString(nums));

            k++;
       }

        System.out.println(Arrays.toString(nums));
        return nums;
    }

    private static void swap(int[] nums, int i, int j) {
        int temp=0;
        temp = nums[i];
        nums[i] = nums[j];
        nums[j]=temp;
    }
}
