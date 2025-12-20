public class TestLongestSubString {
    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0) return 0;

        // Use an array to store the last seen index of each character
        // 128 covers all standard ASCII characters
        int[] lastSeen = new int[128];
        for (int i = 0; i < 128; i++) {
            lastSeen[i] = -1; // Initialize with -1
        }

        int maxLength = 0;
        int left = 0;

        for (int right = 0; right < s.length(); right++) {
            char currentChar = s.charAt(right);

            // If we've seen this char before and it's within our current window
            if (lastSeen[currentChar] >= left) {
                // Shrink the window by jumping 'left' to the position after the duplicate
                left = lastSeen[currentChar] + 1;
            }

            // Update the last seen index of the character
            lastSeen[currentChar] = right;
            
            // Calculate current window size and update max
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }

    public static void main(String[] args) {
        TestLongestSubString sol = new TestLongestSubString();
        System.out.println(sol.lengthOfLongestSubstring("abcdabcbb")); // Output: 3 ("abc")
    }
}
