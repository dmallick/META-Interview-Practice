import java.util.Arrays;

//https://leetcode.com/problems/product-of-array-except-self/description/
/* 
Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums 
except nums[i].

The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.

You must write an algorithm that runs in O(n) time and without using the division operation.

 

Example 1:

Input: nums = [1,2,3,4]
Output: [24,12,8,6]


Example 2:

Input: nums = [-1,1,0,-3,3]
Output: [0,0,9,0,0]


*/
public class ProductOfArrayExceptSelf {
    public int[] calculateProduct(int[]  nums){
        int len =  nums.length, product=1;
        int[] left = new int[len];
        int[] right = new int[len];
        int[] output = new int[len];
        left[0] =1;
        right[len-1]=1;

        // Product of the prefix array
        for(int i=1; i< len; i++){
            product =  nums[i-1] * product;
            left[i] = product;
        }
        // Product of the sufix array
        product = 1;        
        for(int i=len-2; i>=0; i--){
            
            product =  nums[i+1] * product;
            right[i] = product;
            
        }
        //System.out.println("Right->  "+Arrays.toString(right));
        //System.out.println("Left->  "+Arrays.toString(left));

        for(int i =0; i< len; i++){
            output[i] = left[i] * right[i];
        }
        
        return output;
    }

    public static void main(String[] args) {
        int[]  nums = {-1,1,0,-3,3};
        ProductOfArrayExceptSelf pae = new ProductOfArrayExceptSelf();
        int[] output = pae.calculateProduct( nums);
        System.out.println("output->  "+Arrays.toString(output));
    }
}

