import java.util.Arrays;

//https://leetcode.com/problems/product-of-array-except-self/description/
public class ProductOfArrayExceptSelf {
    public int[] calculateProduct(int[]  nums){
        int len =  nums.length, product=1;
        int[] left = new int[len];
        int[] right = new int[len];
        int[] output = new int[len];
        left[0] =1;
        right[len-1]=1;

        for(int i=1; i< len; i++){
            product =  nums[i-1] * product;
            left[i] = product;
        }
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

