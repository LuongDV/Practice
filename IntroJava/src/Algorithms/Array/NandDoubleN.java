package Algorithms.Array;

import java.util.HashSet;
import java.util.Set;

public class NandDoubleN {

    public static void main(String[] args) {
        int[] arr = {7, 1, 14, 11};

        System.out.println(checkIfExist(arr));
    }

    public static boolean checkIfExist(int[] arr) {
        Set<Integer> seen = new HashSet<>();
        for (int i : arr) {
            if (seen.contains(2 * i) || (i % 2 == 0 && seen.contains(i / 2)))
                return true;
            seen.add(i);
        }
        return false;
    }
}
