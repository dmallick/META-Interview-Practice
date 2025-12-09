import java.util.Arrays;

public class MergeSortedArrays {
    
    public static void sortArrays(int[] arr1, int m, int[] arr2, int n){
        int i = m - 1;        // Pointer for nums1
        int j = n - 1;        // Pointer for nums2
        int k = m + n - 1;    // Pointer for final merging

        System.out.println("i: " + i + " j: " + j + " k: " + k);

        while (i >= 0 && j >= 0) {
            if (arr1[i] > arr2[j]) {
                arr1[k--] = arr1[i--];
            } else {
                arr1[k--] = arr2[j--];
            }
        }

        // Copy leftover nums2 elements
        while (j >= 0) {
            arr1[k--] = arr2[j--];
        }
        System.out.println("the final sorted array: " + Arrays.toString(arr1));
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 3, 5, 0, 0, 0};
        int m = 3;

        int[] nums2 = {2, 4, 6};
        int n = 3;

        sortArrays(nums1, m, nums2, n);

    }
}
