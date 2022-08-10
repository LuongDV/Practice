package Algorithms.Array;

import java.util.HashMap;
import java.util.Map;

public class sumPairNumberCrimson {
    public static int DEC_10 = 10;

    public static void main(String[] args) {
//        int[] A = new int[]{51, 71, 17, 42};
//        int[] A = new int[]{42, 33, 60};
//        int[] A = new int[]{51, 32, 43};
        int[] A = new int[]{19, 15, 51, 91, 33};
        int result = solution(A);
        System.out.println(result);
    }

    public static int solution(int[] A) {
        Map<Integer, Integer> mapSumToNumber = new HashMap<>();
        int max = -1;
        for (int item : A) {
            int tempMax;
            if (mapSumToNumber.containsKey(totalDigitsOfNumber(item))) {
                tempMax = mapSumToNumber.get(totalDigitsOfNumber(item)) + item;
                max = Math.max(tempMax, max);
                if (item > mapSumToNumber.get(totalDigitsOfNumber(item))) {
                    mapSumToNumber.replace(totalDigitsOfNumber(item), item);
                }
            } else {
                mapSumToNumber.put(totalDigitsOfNumber(item), item);
            }
        }
        return max;
    }

    // complexity : O(n)
    public static int totalDigitsOfNumber(int n) {
        int total = 0;
        do {
            total = total + n % DEC_10;
            n = n / DEC_10;
        } while (n > 0);
        return total;
    }
}
