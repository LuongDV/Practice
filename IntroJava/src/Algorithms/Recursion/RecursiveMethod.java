package Algorithms.Recursion;

public class RecursiveMethod {

    public static void main(String[] args) {
        recursiceMethod(5);
    }
    static void recursiceMethod(int n) {
        if (n < 1) {
            System.out.println(" N is less than 1");
        } else {
            recursiceMethod(n-1);
            System.out.println(n);
        }
    }
}
