import java.util.Arrays;

public class RemoveDuplicatesFromArray {
    
    public static int removeDuplicate(int[] nums){
        if (nums.length == 0) {
            return 0;
        }
        
        int uniqueIndex = 0; // Pointer for the position of unique elements
        
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[uniqueIndex]) {
                uniqueIndex++;
                nums[uniqueIndex] = nums[i];
            }
        }
        
        // Fill remaining positions with placeholder value (e.g., -1)
        for (int i = uniqueIndex + 1; i < nums.length; i++) {
            nums[i] = -1; // Or any other placeholder value
        }
        
        return uniqueIndex + 1; // Number of unique elements
    }

    public static void main(String[] args) {
        //int nums[]= {0, 0, 1, 1, 2, 2, 3, 3, 4};
        int[] nums = {1, 1, 1, 3, 5, 7, 7, 7};

        int num = removeDuplicate(nums);

        System.out.println(Arrays.toString(nums) +" & no of uniqueue elements = " + num);

    }
}
