package Algorithms.HashTable;
import java.util.ArrayList;

public class LinearProbing {
    String[] hastable;
    int usedCellNumber;

    LinearProbing(int size) {
        hastable = new String[size];
        usedCellNumber = 0;
    }

    public int modASCIIHashFunction(String word, int M) {
        char ch[];
        ch = word.toCharArray();

        int i, sum;
        for (sum = 0, i = 0; i < word.length(); i++) {
            sum = sum + ch[i];
        }
        return sum % M;
    }

}
