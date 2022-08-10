package Algorithms.Array;

import java.util.Arrays;

public class MergeSortedArray {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = {2, 5, 6};
        int n = 3;

        merge(nums1, m, nums2, n);
        System.out.println(Arrays.toString(nums1));
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
//       c1: if (n >= 0) System.arraycopy(nums2, 0, nums1, m, n);
        // c2
        for (int i = 0; i < n; i++)
            nums1[i + m] = nums2[i];
        Arrays.sort(nums1);
    }
}
