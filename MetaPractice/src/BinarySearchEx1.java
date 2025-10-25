public class BinarySearchEx1 {
    
    public static void main(String[] args) {
        
        int[] arr = {1,2,3,4,5,6,7,8,9};        
        int targetElement = 3;
        int index = findTarget(arr, targetElement);
        //findTarget(arr, targetElement);
    }

    static int findTarget(int[] arr, int targetElement ){
        int startIndex=0, endIndex=arr.length-1, medium=0;

        medium = Math.round(arr.length/2);
        
        for(startIndex=0; startIndex<arr.length; startIndex++){
            
            medium = Math.round( (startIndex+ endIndex)/2);
            if(targetElement == arr[medium]){
                System.out.println("Element 3 found at " + medium);
                return medium;
            }    
            
            else if(targetElement > arr[medium]){
                System.out.println("Element 3  is at right of " + medium);
                startIndex = medium +1;
            }    
            
            else if(targetElement < arr[medium])
                System.out.println("Element 3 is at left of " + medium);
                endIndex = medium -1 ;
            }    

            return medium;
        }
        

        
    }
