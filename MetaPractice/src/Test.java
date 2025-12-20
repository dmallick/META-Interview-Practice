import java.util.Arrays;

public class Test {
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
