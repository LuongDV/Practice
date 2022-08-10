package Algorithms.Array;

public class FindMaxConsecutiveOnes {

    public static void main(String[] args) {
        int[] nums = {1, 0, 1, 1, 0, 1};
        System.out.println(findMaxConsecutiveOnes(nums));
    }

    public static int findMaxConsecutiveOnes(int[] nums) {
        if (null == nums) {
            return 0;
        }
        int count = 0;
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                count++;
            } else {
                if (count > max) {
                    max = count;
                }
                count = 0;
            }
        }

        max = Math.max(count, max);
        return max;
    }
}
