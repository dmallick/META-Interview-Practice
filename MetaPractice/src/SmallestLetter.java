public class SmallestLetter {
    public static void main(String[] args) {
        char[] charArray = {'d', 'g', 'k', 'm', 'o'};
        char targetElement = 'i';
        findSmallestChar(charArray, targetElement);
    }

    static char findSmallestChar( char[] arr, char targetElement){
         int stIndex = 0, endIndex = arr.length-1, mid = 0;
        System.out.println("Target search element: "+ targetElement);
        while (stIndex <= endIndex) {
            mid = (stIndex + endIndex) / 2;
            System.out.println("Start Inedx: "+ stIndex +", End Inedx: "+ endIndex +", Mid Inedx: "+ mid + ", Value at mid: " + arr[mid]);
            if (arr[mid] == targetElement) {
                return arr[mid];
            } else if (targetElement < arr[mid] ) {
                endIndex = mid -1;
            } else if (targetElement > arr[mid] ) {
                stIndex = mid + 1;
            }
        }
        System.out.println("-------------------- Found At" + arr[stIndex]);
        return arr[stIndex];
        
    }

}
