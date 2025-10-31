public class CeilingNumber {
    public static void main(String[] args) {
        int[] arr = {19, 23, 56, 61, 72, 88, 92};
        int targetElement = 68;
        findCeilling(arr, targetElement);
    }

    static int findCeilling(int[] arr, int targetElement ){
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
        System.out.println("-------------------- FLOOR" + arr[stIndex]);
        return arr[stIndex];
    }
}
