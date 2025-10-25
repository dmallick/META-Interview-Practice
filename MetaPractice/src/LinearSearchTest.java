public class LinearSearchTest {
       
    public static void main(String[] args) {
        int searchNum = 40;
        int arr[] = {10, 20, 30, 40, 50};
        int status = searchNumber(arr, searchNum);

        System.out.println("Status Code = " + status);
    }

    public static int searchNumber(int arr[], int searchNum){
        int status = 0;
        for(int i=0; i< arr.length; i++){
            if (arr[i] == searchNum) {
                System.out.println("The element found in position: " + (i+1)); 
                status =1;
            }
            
        }

        return status;
        
    }
}
