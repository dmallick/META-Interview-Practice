import java.util.Arrays;

public class BubbleSortAlgorithm {
    
    
    public static void main(String[] args) {
        int[] arr = {3,9,1,7,5,6,1,4};
        sort(arr);
    }

    static void sort(int[] arr){
        int i = 0, j=0;
        while(i<arr.length){ // this is based on the idea that, at max you will have n-1 loop
            for (j = 1; j < arr.length; j++) {
                if(arr[j] < arr[j-1]){
                    //arr = swap(arr, j);
                    swap(arr, j);                    
                }else{
                    //System.out.println("No Swap For positions: " + arr[j-1] + ", " + arr[j]);
                }
            }
            i++;
        }
    }

    private static void swap(int[] arr, int j) {
        System.out.println("Array before swap:  " + Arrays.toString(arr));
        int temp=0;
        temp = arr[j];
        arr[j] = arr[j-1];
        arr[j-1] = temp;
        System.out.println("Swap For positions: " + arr[j] + ", " + arr[j-1]);
        System.out.println("Array after swap:  " + Arrays.toString(arr));


    }
}
