package top100gfg;
//https://leetcode.com/problems/product-of-array-except-self/description/
import java.util.Arrays;

public class ProductArray {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        int[] output = findProduct(nums);
        //System.out.println(Arrays.toString(output));
    }

    private static int[] findProduct(int[] nums) {     
        int len = nums.length;
        int product = 1;
        int[] output = new int[len];
        //System.out.println(Arrays.toString(output));
        for(int i=1; i< len; i++){
            //output[i] = output[i] * nums[i+1];
            product = product * nums[i-1];
            output[i-1] = product;
        }
        product = 1;
        for(int i=len-1; i>=0; i--){
            //output[i] = output[i] * nums[i+1];
            product = product * nums[i];
            output[i-1] = product;
        }
        System.out.println(Arrays.toString(output));        
        return output;
    }
}
