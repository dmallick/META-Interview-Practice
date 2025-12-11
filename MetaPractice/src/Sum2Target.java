//Two Pointers — Two Sum (sorted array)
public class Sum2Target {
        
        public static int[] twoSum(int[] nums, int target) {
            int left = 0;
            int right = nums.length - 1;

            while (left < right) {
                int sum = nums[left] + nums[right];

                if (sum == target) {
                    return new int[]{left, right};   // Found the pair
                }
                else if (sum > target) {
                    right--;    // Sum too big → move right pointer left
                }
                else {
                    left++;     // Sum too small → move left pointer right
                }
            }

            return new int[]{-1, -1};  // If no pair found
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, 4, 6, 8, 11, 15};
        int target = 10;

        int[] result = twoSum(nums, target);

        System.out.println("Indices: " + result[0] + ", " + result[1]);
        System.out.println("Values : " + nums[result[0]] + ", " + nums[result[1]]);
    }    
}
