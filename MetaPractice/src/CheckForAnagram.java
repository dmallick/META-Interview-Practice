import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CheckForAnagram {
    public static void listAnageam(String[] input){
        Map<String, List<String>> map = new HashMap<>();
            
    
        for(String str:input){
            char[] a = str.toCharArray();
            Arrays.sort(a);
            System.out.println(" -- "+a);
            String key = new String(a);
            map.computeIfAbsent(key, k -> new ArrayList<>()).add(str);
            System.out.println(" ## "+ map);
        }


    }

    public static void main(String[] args) {
        String[] input = {"eat", "tea", "tan", "ate", "nat", "bat"};
        listAnageam(input);
    
    
    }
}
