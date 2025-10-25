public class FindMaxNumber {
    public static void main(String[] args) {
        int arr[] = {39, 10, 55, 100, 20, 30, 40, 50};
        int maxNum = findMaxNumber(arr);
        System.out.println("The max number is: " + maxNum);
    }

    public static int findMaxNumber(int arr[]){
        int maxNum=0, currentNum = 0;
        
        for(int i=0; i< arr.length; i++){
            currentNum = arr[i];
            if(currentNum > maxNum)
                maxNum = currentNum;
        }

        return maxNum;
    }
}
