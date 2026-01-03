import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
https://leetcode.com/problems/valid-anagram/description/
Given two strings s and t, return true if t is an anagram of s, and false otherwise.

Example 1:
Input: s = "anagram", t = "nagaram"
Output: true

Example 2:
Input: s = "rat", t = "car"
Output: false
*/

public class AnagramProblem {
    

     public static void main(String[] args) {
        String[] input= {"eat","tea","tan","ate","nat","bat"};
        List output = findAnagram(input);
        System.out.println(output);

     }

     private static List findAnagram(String[] input) {
        Map<String, List<String>> map = new HashMap<>();
        
        int len = input.length;
        for(int i=0; i< len; i++){
            String str = input[i];
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String sortedStr = new String(chars);
            System.out.println(str +" --->" + sortedStr);
            if (!map.containsKey(sortedStr)) {
                map.put(sortedStr, new ArrayList<String>());
            }
            map.get(sortedStr).add(str);
        }

        //return new ArrayList<>();
        return new ArrayList<>(map.values());


     }


}
