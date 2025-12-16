import java.util.HashMap;
import java.util.Map;

public class SubArraySumEqN {
    
    public int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1); // prefix sum 0 occurs once

        int currSum = 0;
        int count = 0;

        for (int num : nums) {
            currSum += num;

            // Check if (currSum - k) was seen before
            if (map.containsKey(currSum - k)) {
                count += map.get(currSum - k);
            }

            // Add the current prefix sum to map
            map.put(currSum, map.getOrDefault(currSum, 0) + 1);
        }

        return count;
    }

    public static void main(String[] args) {
        SubArraySumEqN solution = new SubArraySumEqN();
        int[] nums = {1, 2, 3};
        int k = 3;

        System.out.println(solution.subarraySum(nums, k)); // Output: 2
    }
}
