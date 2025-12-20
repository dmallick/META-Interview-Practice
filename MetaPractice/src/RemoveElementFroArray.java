import java.util.Arrays;

public class RemoveElementFroArray {
    public static void main(String[] args) {
        int[] nums = {3,2,2,3};
        int target =3;
        int output= removeElement(nums, target);
    }

    public static int removeElement(int[] nums, int val) {
        int i = 0; // Pointer for position to place next valid element
        
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != val) {
                nums[i] = nums[j];
                i++;
            }
        }
        //System.out.println(Arrays.toString(Arrays.copyOfRange(nums,0, i)));
        Arrays.fill(nums, i, nums.length, '_');
        System.out.println(Arrays.toString(nums));
        return i;
    }  
}
