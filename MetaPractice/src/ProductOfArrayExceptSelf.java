import java.util.Arrays;

public class ProductOfArrayExceptSelf {
    public int[] calculateProduct(int[] numbers){
        int len = numbers.length;
        int[] results = new int[numbers.length]; 
        results[0]=1;
        for(int i=1; i< len; i++){
            results[i]=results[i-1] * numbers[i-1];  
        }
        System.out.println("The prefix elements: " + Arrays.toString(results));

        //The postfix elements
        int suffix = 1;
        for (int i = len - 1; i >= 0; i--) {
            results[i] = results[i] * suffix;
            suffix *= numbers[i];
        }
        System.out.println("Final Result: " + Arrays.toString(results));


        return results;
    }

    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5};
        ProductOfArrayExceptSelf pae = new ProductOfArrayExceptSelf();
        pae.calculateProduct(numbers);
    }
}
