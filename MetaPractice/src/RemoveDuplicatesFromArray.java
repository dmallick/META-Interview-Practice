//Remove Duplicates from Sorted Array - LeetCode 26 - Two-Pointer O(N) In-Place


import java.util.Arrays;

public class RemoveDuplicatesFromArray {
    
    public static int removeDuplicate(int[] nums){
        if (nums.length == 0) {
            return 0;
        }
        
        int slow = 0; // Pointer for the position of unique elements
        
        for (int fast = 1; fast < nums.length; fast++) {
            if (nums[fast] != nums[slow]) { // Keep the index of slow pointer intact. Only move if there is a match.
                slow++;
                nums[slow] = nums[fast]; //Shifting the unmatched value next to the unique one. For example, move 2 next to 1
            }
        }
        
        // Fill remaining positions with placeholder value (e.g., -1)
        for (int fast = slow + 1; fast < nums.length; fast++) {
            nums[fast] = -1; // Or any other placeholder value
        }
        
        return slow + 1; // Number of unique elements
    }

    public static void main(String[] args) {
        //int nums[]= {0, 0, 1, 1, 2, 2, 3, 3, 4};
        //int[] nums = {1, 1, 1, 3, 5, 7, 7, 7};
        int[] nums = {1,1,1,1,2,3,3,4};

        int newLen = removeDuplicate(nums);
        System.out.println(Arrays.toString(Arrays.copyOf(nums, newLen)));

        //System.out.println(Arrays.toString(nums) +" & no of uniqueue elements = " + num);

    }
}
