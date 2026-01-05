import java.util.ArrayList;
import java.util.List;
/*
https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/
Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.

If target is not found in the array, return [-1, -1].
You must write an algorithm with O(log n) runtime complexity.

Example 1:

Input: nums = [5,7,7,8,8,10], target = 8
Output: [3,4]
Example 2:

Input: nums = [5,7,7,8,8,10], target = 6
Output: [-1,-1]
Example 3:

Input: nums = [], target = 0
Output: [-1,-1]

*/
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
        int stIndex = 0, endIndex = arr.length-1, mid = 0;
        System.out.println("Target search element: "+ targetElement);
        while (stIndex <= endIndex) {
            mid = (stIndex + endIndex) / 2;
            //System.out.println("Start Inedx: "+ stIndex +", End Inedx: "+ endIndex +", Mid Inedx: "+ mid + ", Value at mid: " + arr[mid]);
            if (arr[mid] == targetElement) {
                System.out.println("====>.       The Mid Value fount is: " + arr[mid] + " at " + mid);
                position.add(mid);
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
