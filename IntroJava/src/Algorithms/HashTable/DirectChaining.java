package Algorithms.HashTable;


import java.util.LinkedList;

public class DirectChaining {
    LinkedList<String>[] hashtable;

    int maxChainSize = 5;

    DirectChaining(int size) {
        hashtable = new LinkedList[size];
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

    public void insertHashTable(String word) {
        int newIndex = modASCIIHashFunction(word, hashtable.length);
        if (hashtable[newIndex] == null) {
            hashtable[newIndex] = new LinkedList<String>();
            hashtable[newIndex].add(word);
        } else {
            hashtable[newIndex].add(word);
        }
    }

    public void displayHashTable() {
        if (hashtable == null) {
            System.out.println("HashTable does not exist");
        } else {
            System.out.println("-------------HashTAble---------");
            for (int i = 0; i < hashtable.length; i++) {
                System.out.println("Index " + i + ", key: " + hashtable[i]);
            }
        }
    }

    public boolean searchHashTable(String word) {
        int newIndex = modASCIIHashFunction(word, hashtable.length);
        if (hashtable[newIndex] != null && hashtable[newIndex].contains(word)) {
            System.out.println("\n" + "\"" + word + "\"" + " found in HashTable at location: " + newIndex);
            return true;
        } else {
            System.out.println("\n" + "\"" + word + "\"" + " not found in HashTable");
            return false;
        }
    }

    public void deleteKeyHashTable(String word) {
        int newIndex = modASCIIHashFunction(word, hashtable.length);

        boolean result = searchHashTable(word);

        if (result) {
            hashtable[newIndex].remove(word);
            System.out.println("\n" + "\"" + word + "\"" + " has been deleted from HashTable");
        } else {
            System.out.println("\n" + "\"" + word + "\"" + " not found in HashTable");
        }
    }
}

class main {
    public static void main(String[] args) {
        DirectChaining directChaining = new DirectChaining(15);
        directChaining.insertHashTable("The");
        directChaining.insertHashTable("quick");
        directChaining.insertHashTable("brown");
        directChaining.insertHashTable("fox");
//        directChaining.searchHashTable("fox");
        directChaining.deleteKeyHashTable("fox");
        directChaining.displayHashTable();
    }
}
