public class LongestCommonPrefix {
    
    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";

        // Find minimum length among strings
        int minLen = Integer.MAX_VALUE;
        for (String s : strs) {
            minLen = Math.min(minLen, s.length());
        }

        int low = 1;
        int high = minLen;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (isCommonPrefix(strs, mid)) {
                low = mid + 1;   // try for longer prefix
            } else {
                high = mid - 1; // reduce prefix length
            }
        }

        return strs[0].substring(0, high);
    }

    
    private static boolean isCommonPrefix(String[] strs, int len) {
        String prefix = strs[0].substring(0, len);
        for (int i = 1; i < strs.length; i++) {
            if (!strs[i].startsWith(prefix)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String[] words = {"interview", "internet", "internal", "interval"};
        System.out.println("Longest Common Prefix: " + longestCommonPrefix(words));
    }
}
