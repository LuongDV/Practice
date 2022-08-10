package Algorithms.Array;

import java.util.Random;
import java.util.Scanner;

public class Exercise { //part1
    //Bài 1:
//    public static void main(String[] args) {
//        int m, n;
//        Scanner scanner = new Scanner(System.in);
//        m = scanner.nextInt();// chieu cao hinh chu nhat
//        n = scanner.nextInt();// chieu rong hinh chu nhat
//
//        for (int i = 0; i < m; i++) {// tang hang
//            for (int j = 0; j < n; j++) {// tang theo cot
//                System.out.print(" * ");
//                //*************
//            }
//            System.out.println();// in xuong dong
//        }


    //bai 2
//    public static void main(String[] args) {
//        int m, n;
//        Scanner scanner = new Scanner(System.in);
//        m = scanner.nextInt();
//        n = scanner.nextInt();
//
//        for (int i = 0; i < m; i++) {
//            for (int j = 0; j < n; j++) {
//                if (i == 0 || j == 0 || i == m - 1 || j == n - 1) {
//                    System.out.print(" * ");
//                } else {
//                    System.out.print("   ");
//                }
//            }
//            System.out.println();
//        }
//    }

    //        //bai3
//    public static void main(String[] args) {
//        int h;
//        Scanner scanner = new Scanner(System.in);
//        h = scanner.nextInt();
//        int x, output;
//
//        for (int i = 1; i <= h; i++) {
//            for (int j = 0; j <= 2 * h; j++) {
//                x = j - h;
//                if (x < 0) {
//                    x *= -1;
//                }
//                output = i - x;
//
//                if (output > 0) {
//                    System.out.printf("%3d", output);
//                } else {
//                    System.out.printf("   ");
//                }
//            }
//            System.out.println();
//        }


    //        //bai4
//    public static void main(String[] args) {
//        for (int i = 1; i < 10; i++) {
//            for (int j = 0; j <= 10; j++) {
//                System.out.printf("%2d x %2d = %3d\n", i, j, (i * j));
//            }
//            System.out.println("______________________________");
//        }
//    }
//
    //bai5
//    public static void main(String[] args) {
//        int input;
//        Scanner scanner = new Scanner(System.in);
//        input = scanner.nextInt();
//        int count = 0;
//        Random random = new Random();
//        while (true) {
//            int randNumber = random.nextInt(100); // [0,99]
//            count++;
//            System.out.println("Random number: " + randNumber + ", input: " + input);
//            if (randNumber == input) {
//                System.out.println("Thuc hien " + count + " lan.");
//                break;
//            }
//        }
//    }
//
    //bai6
    public static void bai6(String[] args) {
        int n, i;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();

        if (n % 2 == 0) {// neu n chan
            i = 2;
        } else { // n le
            i = 1;
        }
        long sum = 0;
        for (; i <= n; i += 2) {
            sum += i;
        }
        System.out.println("RESULT = " + sum);
    }
//
//
    //bai7
    public static void bai7(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();

        double sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += (double) 1 / i;// chu y ep kieu cho chinh xac
        }

        System.out.printf("RESULT= %8.3f", sum);
    }
//
//    //    bai8
    public static void bai8(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();

        int count = 0;
        for (int i = 1; i <= n; i++) {//xet uoc la so duong
            if (n % i == 0) {
                count++;
                System.out.print(i + " ");
            }
        }
        System.out.println("\nn co " + count + " uoc so");
    }
//
//    //    bai9
    public static void bai9(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        int sum = 0;
        int x;
        while (n > 0) {
            x = n % 10;
            n /= 10;
            sum += x;
        }
        System.out.println("SUM = " + sum);
    }
//
//    //bai10
    public static void bai10(String[] args) {
        int n = new Scanner(System.in).nextInt();
        int i = 2;
        if (n == 1) {
            System.out.println(n + " = " + n);
        } else {
            System.out.print(n + " = ");
            while (n != 1) {
                if (n % i == 0) {
                    System.out.print(i + " x ");
                    n /= i;
                } else {
                    ++i;
                }
            }
            System.out.print("\b\b\b");
        }
    }
//
//    //    bai11
    public static void bai11(String[] args) {
        int n;
        n = new Scanner(System.in).nextInt();
        int count = 0;
        int x = 2;
        while (true) {
            if (isNgTo(x)) {
                System.out.print(x + " ");
                count++;
            }
            if (count == n) {
                break;
            }
            if (x == 2)
                x++;
            else {
                x += 2;
            }
        }
    }

    public static boolean isNgTo(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
//
//
//    //bai12
    public static void bai12(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        long f0 = 0, f1 = 1, fn = 0;
        for (int i = 0; i <= n; i++) {
            if (i < 2) {
                System.out.println(i);
            } else {
                fn = f0 + f1;
                f0 = f1;
                f1 = fn;
                System.out.println(fn);
            }
        }
    }
//
//    //    bai13
    public static void bai13(String[] args) {
        int count = 0;
        for (int i = 100000; i < 999999; i++) {
            int tmp = 0;
            int n = i;
            while (n > 0) {
                tmp = tmp * 10 + n % 10;
                n /= 10;
            }

            if (i == tmp) {
                System.out.printf("%10d", i);
                count++;
                if (count % 10 == 0) {
                    System.out.println();
                }
            }

        }
    }
//
//    //bai14
    public static void bai14(String[] args) {
        int m, n;
        Scanner scanner = new Scanner(System.in);
        m = scanner.nextInt();
        n = scanner.nextInt();
        int count = 0;
        if ((m >= 0 && n >= 0) || n >= 0) {
            for (int i = m; i <= n; i++) {
                if(i>=0){
                    int res = (int)Math.sqrt(i);
                    if(res*res == i){
                        count++;
                        System.out.printf("%10d", i);
                        if(count %10 == 0){
                            System.out.println();
                        }
                    }
                }
            }
        }
        System.out.println("\nSo luong so chinh phuong thoa man: " + count);
    }
//
//    //bai15
    public static void main(String[] args) {
        double c;
        Scanner scanner = new Scanner(System.in);
        c = scanner.nextDouble();
        double pi = 0;
        long n = 0;
        double x = 1.0 / (n * 2 + 1);
        while (c <= x) {
            pi += Math.pow(-1, n)*x;
            n++;
            x = 1.0 / (2 * n + 1);
        }
        pi *= 4;
        System.out.println("PI = " + pi);
    }
}

