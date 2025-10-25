import java.util.HashSet;

public class YLongestSubStringx {
    public static void main(String[] args) {
    String input = "xabcabcbb"; // = 8    
    int maxLength = findLongestSubString(input); 
    System.out.println("Max Length:"+maxLength);
    }

    public static int findLongestSubString(String input) {
        int maxLength = 0;
        char ch;
        HashSet hs = new HashSet<String>();
        for (int right = 0, left = 0; right< input.length(); right++) {
            ch = input.charAt(right - left);
            if (!hs.contains(ch)) {
                hs.add(ch);
                maxLength = Math.max(maxLength, right - left + 1);
                
                System.out.println("if Block" + hs);
            }else {
                hs.remove(input.charAt(left));
                left++;
                hs.add(ch);
                right++;

                System.out.println("else Block" + hs);
            }


        }


        return maxLength;
    }
}



