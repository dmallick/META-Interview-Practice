/*
https://leetcode.com/problems/reverse-integer/description/
Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.

Assume the environment does not allow you to store 64-bit integers (signed or unsigned).

Example 1:
Input: x = 123
Output: 321


Example 2:
Input: x = -123
Output: -321


Example 3:
Input: x = 120
Output: 21

*/


public class ReverseNumber {
    public static void main(String[] args) {
        reverse(1234);
    }

    private static void reverse(int num) {
        int reverse = 0, reminder = 0;
                
        while (num > 0) {
            reminder = num % 10;
            reverse = reverse * 10 + reminder;
            num = num /10;

        }
        System.out.println("The reverse is: "+ reverse);
    }
    
}
