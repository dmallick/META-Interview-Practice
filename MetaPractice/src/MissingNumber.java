import java.lang.reflect.Array;
import java.util.Arrays;

public class MissingNumber {

    public static void main(String[] args) {
        int[] arr = {4, 0, 2, 1}; // missing number should be 4;
        sortArray(arr);
        findMissingNumber(arr);
        //System.out.println("The missing number is: " + missingNumber);
        
    }

    private static void findMissingNumber(int[] arr) {
        int index = 0;
         // search for first missing number
        for (index = 0; index < arr.length; index++) {
            if (arr[index] != index) {
                System.out.println("the missing number is: " + index);
                //return index;
            }
        }
        
    }

    private static void sortArray(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i];
            if (arr[i] < arr.length && arr[i] != arr[correct]) {
                swap(arr, i , correct);
            } else {
                i++;
            }

        }
    }    

    private static void swap(int[] arr, int first, int second) {
        int temp =0;
        temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;

    }
}