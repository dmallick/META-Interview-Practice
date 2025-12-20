import java.util.Arrays;

//The problem states: "The majority element is the element that appears more than ⌊n/2⌋ times" 
// and "You may assume that the majority element always exists in the array."
public class FindMajorityElement {
    public static void main(String[] args) {
        int[] nums={2,3,2,3,2,3,3,3,4,4,4,4,4,4,4,4};
        int high=finfMajority(nums);
        System.out.println(high);
    }

    private static int finfMajority(int[] nums) {
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        return nums[nums.length / 2];
    }
}

