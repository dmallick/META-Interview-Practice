import java.util.Arrays;

public class SortColorBalls {
    public static void main(String[] args) {
        //int[] nums = {2,0,2,1,1,0};
        int[] nums = {4,2,6,5,3,9};
        nums = sort(nums, 0, 1);
    }

    private static int[] sort(int[] nums, int st, int ed) {
        int pivot=nums.length/2;
        System.out.println("Before value of nums, st & ed: " + Arrays.toString(nums) + " -- " + nums[st] + "  " + nums[ed] + " " + nums[pivot]);
        if (nums[ed] > nums[pivot]) {
            ed++;
        }else{
            st++;
            swap(nums, st, ed);
        }
        System.out.println("After value of nums, st & ed: " + Arrays.toString(nums) + " -- " + nums[st] + "  " + nums[ed] + " " + nums[pivot]);

        //sort(nums, st, ed);

        
       
        return nums;
    }

    private static void swap(int[] nums, int st, int ed) {
        int temp=0;
        temp = nums[st];
        nums[st] = nums[ed];
        nums[ed] = temp;
    }
}
