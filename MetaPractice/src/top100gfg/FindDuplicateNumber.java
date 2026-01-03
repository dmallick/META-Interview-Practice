package top100gfg;

import java.util.HashSet;

public class FindDuplicateNumber {
    public static void main(String[] args) {
        int[] nums = {3,3,3,3,3};
        int dup = findDuplicate(nums);
        System.out.println(dup);
    }

    private static int findDuplicate(int[] nums) {
        HashSet seen = new HashSet<>();
        int len = nums.length;
        for(int i=0; i<len; i++){
            if (!seen.contains(nums[i])) {
                seen.add(nums[i]);                
            }else{
                return nums[i];
            }
        }

        return -1;  
    }
}
