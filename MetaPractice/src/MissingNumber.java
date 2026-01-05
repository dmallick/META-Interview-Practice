
/* 
https://leetcode.com/problems/missing-number/description/
Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is 
missing from the array.

Example 1:

Input: nums = [3,0,1]
Output: 2

Explanation:
n = 3 since there are 3 numbers, so all numbers are in the range [0,3]. 2 is the missing number in the range since it does not 
appear in nums.

Example 2:

Input: nums = [0,1]
Output: 2

Explanation:
n = 2 since there are 2 numbers, so all numbers are in the range [0,2]. 2 is the missing number in the range since it does not 
appear in nums.

Example 3:

Input: nums = [9,6,4,2,3,5,7,0,1]
Output: 8

Explanation:
n = 9 since there are 9 numbers, so all numbers are in the range [0,9]. 8 is the missing number in the range since it 
does not appear in nums.
*/

public class MissingNumber {

    public static void main(String[] args) {
        int[] arr = {4, 0, 2, 1}; // missing number should be 3;
        sortArray(arr);
        findMissingNumber(arr);
        //System.out.println("The missing number is: " + missingNumber);
        
    }

    private static void findMissingNumber(int[] arr) {
        int index = 0;
         // search for first missing number
        for (index = 0; index < arr.length; index++) {
            if (arr[index] != index) {
                System.out.println("the missing number is: " + index);
                //return index;
            }
        }
        
    }

    private static void sortArray(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i];
            if (arr[i] < arr.length && arr[i] != arr[correct]) {
                swap(arr, i , correct);
            } else {
                i++;
            }

        }
    }    

    private static void swap(int[] arr, int first, int second) {
        int temp =0;
        temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;

    }
}