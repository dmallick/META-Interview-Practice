import java.util.Arrays;

public class TestDup {
    
    static int removeDuplicate(int[] arr){
        int slow=0, len=arr.length;
        for(int fast=1; fast<len; fast++){
            if (arr[fast] != arr[slow]) {
                slow++;
                arr[slow]=arr[fast];

            }
        }
        return slow + 1;
    }

    public static void main(String[] args) {
        int[] arr = {1,1,1,1,2,3,3,4};
        int newLen = removeDuplicate(arr);
        System.out.println(Arrays.toString(Arrays.copyOf(arr, newLen)));
    }
}
