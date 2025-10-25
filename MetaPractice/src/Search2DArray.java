public class Search2DArray {
    public static void main(String[] args) {
        int[][] arr = {
            {12, 34, 22, 10},
            {30, 58, 2, 9, 19},
            {90, 80, 27, 1}
        };
        int searchTargetElement = 19;
        boolean found = search2DArray(arr, searchTargetElement);
    }

    static boolean search2DArray(int[][] arr, int searchTargetElement){
        boolean found = false;
        for(int row = 0; row< arr.length; row++ ){
            for(int col=0; col< arr[row].length; col++){
                if(arr[row][col] == searchTargetElement){ 
                    found = true;
                    System.out.println(arr[row][col] + " -> Row Number: " + (row+1) + ", Column Number: " + (col+1));
                }
            }
        }
        return found;
    }
}
