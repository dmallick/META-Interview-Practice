import java.util.Arrays;

public class CycleSort {

    public static void main(String[] args) {
        int[] arr = {3,5,1,4,2};    
        cycleSort(arr);
    }


    static void cycleSort(int[] arr){
        int i=0;
        int len = arr.length;
        while (i< len) {
            int rightIndecx = arr[i] - 1;
            if(arr[i] != arr[rightIndecx]) {
                System.err.println("The element is not in right index");
                swap(arr, i, rightIndecx);
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
