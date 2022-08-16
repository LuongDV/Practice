package Basic;

public class SumOfDigit {

    public static int DEC_10 = 10;

    public static void main(String[] args) {
        System.out.println(totalDigitsOfNumber(34));
    }

    public static int totalDigitsOfNumber(int n) {
        int total = 0;
        do {
            total = total + n % DEC_10;
            n = n / DEC_10;
        } while (n > 0);
        return total;
    }
}
