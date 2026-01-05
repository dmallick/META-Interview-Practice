import java.util.Arrays;

//Theory: https://www.geeksforgeeks.org/dsa/cycle-sort/
public class CycleSort {

    public static void main(String[] args) {
        int[] arr = {3,7,5,1,4,2, 6};    
        cycleSort(arr);
    }

    static void cycleSort(int[] arr){
        int i=0;
        int len = arr.length;
        while (i< len) {
            int rightIndex = arr[i] - 1;
            if(arr[i] != arr[rightIndex]) {
                System.err.println("The element is not in right index");
                swap(arr, i, rightIndex);
            }else{
                i++;

            }
        }
       System.out.println( Arrays.toString(arr)+"");
   
    }


    private static void swap(int[] arr, int fi, int si) {
        int temp = arr[fi];
        arr[fi] = arr[si];
        arr[si] = temp;
    }


}
