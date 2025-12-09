import java.util.Arrays;

public class ArrayRotation {
    
     public static int[] rotate(int[] nums, int rb){
        //rb = rotate by; len lenth of array; reverse() to reverse the array
        int len=nums.length;
        rb = rb % len; 
        reverse(nums, 0, len-1);
        reverse(nums, 0, rb-1);
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
