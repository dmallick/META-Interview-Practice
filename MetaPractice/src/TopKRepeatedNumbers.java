import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TopKRepeatedNumbers {
    public static int[] topKFrequent(int[] nums, int k) {

        // Step 1: Frequency Map
        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int n : nums) {
            freqMap.put(n, freqMap.getOrDefault(n, 0) + 1);
        }

        // Step 2: Buckets (index = frequency)
        List<Integer>[] buckets = new ArrayList[nums.length + 1];
        for (int i = 0; i < buckets.length; i++) {
            buckets[i] = new ArrayList<>();
        }

        for (int num : freqMap.keySet()) {
            int freq = freqMap.get(num);
            buckets[freq].add(num);
        }

        // Step 3: Iterate buckets from highest freq to lowest
        List<Integer> result = new ArrayList<>();
        for (int i = buckets.length - 1; i >= 0 && result.size() < k; i--) {
            for (int num : buckets[i]) {
                result.add(num);
                if (result.size() == k) {
                    break;
                }
            }
        }

        // Convert to array
        return result.stream().mapToInt(i -> i).toArray();
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 2, 2, 3};
        int k = 2;

        int[] ans = topKFrequent(nums, k);
        System.out.println(Arrays.toString(ans));  // Output: [1, 2]
    }
}
