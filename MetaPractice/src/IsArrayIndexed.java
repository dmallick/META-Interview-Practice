import java.util.Arrays;

public class IsArrayIndexed {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,7,6,8,9,10};
        isArraySorted(arr, 0);
    }

    private static void isArraySorted(int[] arr, int index) {
        int len = arr.length;

        if (index < len -1) {            
            if(arr[index] < arr[index + 1] ){
                System.out.println("Sorted till value: " + arr[index +1]);
                isArraySorted(arr, index+1);
            } else{
                System.out.println("The value at index: " + index + " is greater than index+1: " + (index+1) );
                System.out.println("Done with checking sortabliti of array" + Arrays.toString(arr));
                index = len;
            }
        } else{
            System.out.println("Iterated over the array complete");
        }


    }
    
}
