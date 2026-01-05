/*
https://leetcode.com/problems/longest-common-prefix/description/
Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".

Example 1:

Input: strs = ["flower","flow","flight"]
Output: "fl"


Example 2:

Input: strs = ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.


*/
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

    
    private static boolean isCommonPrefix(String[] strs, int mid) {
        String prefix = strs[0].substring(0, mid);
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


/* Ths is another logic for 
 public static void main(String[] args) {
        String[] strs = {"flower","flight","flow"};
        String shortestWord = findSmallestString(strs);

        String comonPrefix = findLongestCommonPrefix(strs, shortestWord);
        System.out.println("The comonPrefix:  "+comonPrefix);
    }

    private static String findSmallestString(String[] strs) {
        int minlen = strs[0].length();
        String shortestWord=strs[0];
        for(int i=1; i< strs.length; i++){
            int wordlen = strs[i].length();
            if (wordlen < minlen) {
                minlen = wordlen;
                shortestWord=strs[i];
            }
            //System.out.println(shortestWord);

        }
        return shortestWord;
    }



    private static String findLongestCommonPrefix(String[] strs, String shortestWord) {
        String matchingLetters="";
        char[] chars = shortestWord.toCharArray();
        for(int i=0;i<chars.length; i++){
            for(int j=0; j< strs.length; j++){
                char[] charw = strs[j].toCharArray();
                if (chars[i] != charw[i]) {
                    System.out.println("Char " + chars[i] + " is not Matching for word: "+ strs[j]);
                    //matchingLetters = matchingLetters + chars[i];
                    return shortestWord.substring(0, i);
                }else{

                    System.out.println("Char " + chars[i] + " is  Matching for word: "+ strs[j]);
                    //return shortestWord;
                }
                
            }
            

        }


        return matchingLetters;
    }
}

*/