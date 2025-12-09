import java.util.Arrays;

public class MoveZeros {
    
    public int[] moveZeros(int[] nums){
        int j=0, len=nums.length;
        for(int i=0; i<len; i++){
            if (nums[i] != 0) {
                nums[j] = nums[i];
                j++;
            }
        }
        System.out.println("L1 The value of J= " + j + " & nums = " + Arrays.toString(nums));
        while (j < nums.length) {
            nums[j] = 0;
            j++;
        }
        System.out.println("L2 The value of J= " + j + " & nums = " + Arrays.toString(nums));
        return nums;
    }

    public static void main(String[] args) {
        int[] nums = {0,2,7,0,1,0,0,3};
        MoveZeros mz = new MoveZeros();
        nums=mz.moveZeros(nums);
        System.out.println(Arrays.toString(nums));
    }
}
