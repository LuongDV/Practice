package Algorithms.Array;

import java.util.Arrays;

public class SortedSquares {
    public static void main(String[] args) {
        int[] nums = {-4, -1, 0, 3, 10};
        System.out.println(Arrays.toString(sortedSquares(nums)));
    }

    public static int[] sortedSquares(int[] nums) {
        return Arrays.stream(nums).map(a -> a * a).sorted().toArray();
    }
}
