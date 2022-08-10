package Algorithms.Array;

public class FindNumberEvenOfDigits {
    public static void main(String[] args) {
        int[] nums = {555,901,482,1771};
        System.out.println(findNumbers(nums));
    }

    public static int findNumbers(int[] nums) {
        int result = 0;
        for (int item : nums) {
            if (isEven(item)) {
                result++;
            }
        }
        return result;
    }

    public static boolean isEven(int number) {
        int numberOfDigits = 0;
        while (number > 0) {
            numberOfDigits++;
            number = number / 10;
        }
        return numberOfDigits % 2 == 0;
    }
}
