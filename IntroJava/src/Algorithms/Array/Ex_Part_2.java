package Algorithms.Array;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ex_Part_2 {

    //bai1
    public static void bai1(String[] args) {
        int[] arr;
        int n;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        arr = new int[n];
        for(int i = 0; i< n; i++){
            arr[i] = scanner.nextInt();
        }
        // ktra doi xung
        boolean ok = true;
        int mid = n/2;
        int x;
        for(int i = 0; i<= mid; i++){
            x = n-1-i;
            if(arr[i] != arr[x]){
                ok = false;
                break;
            }
        }
        if(ok == true){
            System.out.println("Mang doi xung.");
        }
        else{
            System.out.println("Mang khong doi xung.");
        }
    }


    //bai3

    public static void bai3(String[] args) {
        int n, x, index = -1, min = Integer.MAX_VALUE;
        int[] arr;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao n, x: ");
        n = scanner.nextInt();
        x = scanner.nextInt();

        arr = new int[n];
        // nhap cac phan tu cho mang
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        //kiem tra , tim kq
        for (int i = 0; i < n; i++) {
            int currentMin = getMin(arr[i], x);
            if (nguyenTo(arr[i]) && currentMin < min) {
                min = currentMin;
                index = i;
            }
        }

        if (index != -1) {// tim thay gia tri thoa man
            System.out.println("Chi so phan tu: " + index + ", Gia tri = " + arr[index]);
        } else {
            System.out.println("Khong ton tai gia tri thoa man!");
        }
    }

    public static int getMin(int a, int x) {
        return Math.abs(a - x);
    }

    public static boolean nguyenTo(int n) {
        if (n < 2) {
            return false;
        }
        int a = (int) Math.sqrt(n);
        for (int i = 2; i <= a; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }


    //bai4

    public static void bai4(String[] args) {
        int [] arr;
        int n;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        Random random = new Random();
        arr =  new int[n];
        int count = 0;// dem
        while (count < n){// dem so cac so ngau nhien da dc sinh ra
            arr[count++] =random.nextInt(100);// gan so ngau nhien cho arr[count]; count++
        }
        int [] brr = new int[n];
        int bSize = 0;
        boolean isExist = false;
        for (int i = 0; i < n; i++) {
            isExist = false;
            for (int j = 0; j < bSize; j++) {
                if(arr[i] == brr[j]){
                    isExist = true;
                    break;
                }
            }
            if (!isExist){
                brr[bSize++] = arr[i];
            }
        }

        System.out.println("Truoc khi sap xep: ");
        System.out.println(Arrays.toString(arr));
        // thao tac 1
        Arrays.sort(arr);
        System.out.println("Sau khi sap xep: ");
        System.out.println(Arrays.toString(arr));
        // thao tac 2
        brr = Arrays.copyOfRange(brr, 0, bSize);
        Arrays.sort(brr); // cat bo cac phan tu du thua
        System.out.println("Mang chi chua cac phan tu duy nhat: ");
        System.out.println(Arrays.toString(brr));
    }


    //bai5
    public static Scanner scanner = new Scanner(System.in);

    public static void bai5(String[] args) {
        int[] a, b, c;// 3 mang dau vao
        int m, n, k, p;// m, n, k: so phan tu mang a, b, c tuong ung. p la vi tri chen
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap m, n: ");
        m = scanner.nextInt();
        n = scanner.nextInt();
        k = m + n;

        // nhap du lieu
        System.out.println("Nhap gia tri mang a[] gom " + m + " phan tu");
        a = nhap(m);
        System.out.println("Nhap gia tri b[] gom " + n + " phan tu");
        b = nhap(n);
        c = new int[k];
        System.out.println("Nhap gia tri p: ");

        do {
            p = scanner.nextInt();
        } while (p >= m || p < 0);

        // copy du lieu tu hai mang vao mang dich
        for (int i = 0; i < p; i++) {
            c[i] = a[i];
        }
        // copy ca mang b vao mang c
        for (int i = 0; i < n; i++) {
            c[i+p] = b[i];
        }
        // copy phan con lai cua mang a vao mang c
        for (int i = p; i < m; i++) {
            c[i+n] = a[i];
        }

        System.out.println("Mang a[]: " + Arrays.toString(a));
        System.out.println("Mang b[]: " + Arrays.toString(b));
        System.out.println("Mang c[]: " + Arrays.toString(c));
    }

    public static int[] nhap(int n) {
        int[] x = new int[n];
        for (int i = 0; i < n; i++) {
            x[i] = scanner.nextInt();
        }

        return x;
    }

//bai6
public static void bai6(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int[] arr;
    int n, x;
    n = scanner.nextInt();
    System.out.println("Nhap cac phan tu cua mang arr[] co "+ n + " phan tu: ");
    arr = nhap(n, scanner);
    System.out.println("Nhap x: ");
    x = scanner.nextInt();

    int index = -1;
    for (int i = 0; i < n; i++) {
        if(arr[i] > x){
            index = i;
            break;
        }
    }

    if(index == -1){
        // chen vao cuoi
        arr[n] = x;
    }else{
        //dich phai toan bo cac phan tu tu vi tri index
        for (int i = n; i > index ; i--) {
            arr[i] = arr[i-1];
        }
        arr[index] = x;
    }

    System.out.println(Arrays.toString(arr));
}
    //[1 2 3 4 5 6 ] , x = 5

    public static int[] nhap(int n, Scanner scanner) {
        int[] x = new int[n + 1];
        for (int i = 0; i < n; i++) {
            x[i] = scanner.nextInt();
        }

        return x;
    }


    //bai12
    public class Bai12 {
        /*
            Các bước thực hiện:
            - Tạo mảng đối sánh tương ứng với hệ cơ số
            - Chuyển đổi cơ số-> tạo kết quả đảo
            - Đảo lại kết quả -> Done!
         */
        public static final String BASE = "0123456789ABCDEFGHIJKLMNOPQRSTUVXYZW";

        public  String result(int n, int b){
            StringBuilder stringBuilder = new StringBuilder();
            int x = 0;
            while(n > 0){
                x = n%b;
                n/= b;
                stringBuilder.append(BASE.charAt(x));
            }
            return stringBuilder.reverse().toString();
        }

        public  void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int n, b;
            System.out.println("Nhap gia tri, co so: ");
            n = scanner.nextInt();
            b = scanner.nextInt();

            System.out.println("KET QUA: " + result(n, b));
        }
    }


    //bai17
    public static void main(String[] args) throws IOException {
        Scanner inputFromFile = new Scanner(Paths.get("input.txt"),
                "UTF-8");
        PrintWriter printWriter = new PrintWriter("KETQUA.OUT", "UTF-8");
        // xu ly file:
        while (inputFromFile.hasNextLine()) {
            String name = inputFromFile.nextLine();
            name = name.trim();
            String[] names = name.split(" ");
            StringBuilder builder = new StringBuilder();
            builder.append(names[names.length - 1] + " ");
            builder.append(names[0] + " ");
            for (int i = 1; i < names.length - 1; i++) {
                if (names[i].length() != 0) {
                    builder.append(names[i] + " ");
                }
            }

            name = builder.toString();
            printWriter.println(name);
        }

        printWriter.close();
        inputFromFile.close();
    }
}
