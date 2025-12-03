import java.util.ArrayList;

public class SubStringInString {
    public static void main(String[] args) {
        String str1 = "aab";          //["a", "a", "b", "aa", "ab", "aab"] 
        String str2 = "aaaab";
        ArrayList subList = new ArrayList<>();
        subList = createSubStrings(str1, subList);
        System.out.println(subList);
        
    }
    
    private static ArrayList createSubStrings(String str1, ArrayList subList ) {
        int n = str1.length();

        for (int start = 0; start < n; start++) {
            for (int end = start + 1; end <= n; end++) {
                System.out.println(str1.substring(start, end));
            }
        }

        return subList;
    }
}
