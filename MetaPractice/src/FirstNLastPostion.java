import java.util.ArrayList;
import java.util.List;

public class FirstNLastPostion {
    public static void main(String[] args) {
        int[] arr = {5, 7, 7, 8, 8, 10};
        int targetElement = 8;
        findFirstNLastPostion(arr, targetElement);
    }

    static void findFirstNLastPostion(int[] arr, int targetElement){
        search(arr, targetElement, false);
        search(arr, targetElement, true);
       
    }

    static void search(int[] arr, int targetElement, boolean searchLeft){
        List position = new ArrayList<>();
        //List stringList = new ArrayList<Integer>();
        int stIndex = 0, endIndex = arr.length-1, mid = 0;
        System.out.println("Target search element: "+ targetElement);
        while (stIndex <= endIndex) {
            mid = (stIndex + endIndex) / 2;
            //System.out.println("Start Inedx: "+ stIndex +", End Inedx: "+ endIndex +", Mid Inedx: "+ mid + ", Value at mid: " + arr[mid]);
            if (arr[mid] == targetElement) {
                System.out.println("====>.       The Mid Value fount is: " + arr[mid] + " at " + mid);
                //positionsArray[position] = mid;
                if (searchLeft) {                    
                    endIndex = mid -1;
                    System.out.println("Looking at LEFT with endIndex: " + endIndex);
                } else{
                    stIndex = mid +1;  
                    System.out.println("Looking at RIGHT with Start Index: " + stIndex);
                }    
                //return arr[mid];
            } else if (targetElement < arr[mid] ) {
                endIndex = mid -1;
            } else if (targetElement > arr[mid] ) {
                stIndex = mid + 1;
            }
        }

    }

}
