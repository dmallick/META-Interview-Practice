import java.util.ArrayList;
import java.util.List;

public class RecurrionArrarSearch {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,4,8};        
        int index =0;
        List targetList = new ArrayList<>();
        seachTarget(arr, 4, targetList, index) ;
        System.out.println("The List size is: " + targetList.size());
    }

    private static List seachTarget(int[] arr, int target, List targetList, int index) {
        int len = arr.length;

        if( index < len ){
            if(target == arr[index])
                targetList.add(index);
                
            index++;
            seachTarget(arr, target, targetList, index);   
        }
        return targetList;
    }
    
}
