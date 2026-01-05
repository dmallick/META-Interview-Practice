/*
Given a sorted array and a value x, find index of the ceiling of x. The ceiling of x is the smallest element in an array greater than or equal to x.

Note: In case of multiple occurrences of ceiling of x, return the index of the first occurrence.

Examples : 

Input: arr[] = [1, 2, 8, 10, 10, 12, 19], x = 5
Output: 2
Explanation: Smallest number greater than 5 is 8, whose index is 2.

Input: arr[] = [1, 2, 8, 10, 10, 12, 19], x = 20
Output: -1
Explanation: No element greater than 20 is found. So output is -1.

Input: arr[] = [1, 1, 2, 8, 10, 10, 12, 19], x = 0
Output: 0
Explanation: Smallest number greater than 0 is 1, whose indices are 0 and 1. The index of the first occurrence is 0.

*/
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
