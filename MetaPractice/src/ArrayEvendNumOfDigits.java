public class ArrayEvendNumOfDigits {
    public static void main(String[] args) {
        int[] arr = {12, 345, 67, 3887, 10};
        int count = countNoOfElements(arr);

        System.out.println("The Nof of even digits in " + arr + " = " + count);
        
    }

    static int countNoOfElements(int[] arr){
        int countOfEvensElements=0;
        for(int i=0; i<arr.length; i++){
            if ( (String.valueOf(arr[i]).length()) % 2 ==0) 
                countOfEvensElements++;
        }

        return countOfEvensElements;
    }
}
