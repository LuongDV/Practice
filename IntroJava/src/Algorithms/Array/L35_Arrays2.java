package Algorithms.Array;

public interface L35_Arrays2 {
    public static void main(String[] args) {
        //tổng quát: kiểu [][] tên mảng;
        int[][] arr = new int[4][3];

        //chỉ số bất kì : 0 -> length-1

        arr[0][0] = 100;
        arr[0][1] = 100;
        arr[arr.length - 1][arr[0].length - 1] = 100;

        int[][] arr2 = /*new int[][]*/ {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 1, 2, 3}
        };

        for (int i = 0; i < arr.length; i++) { //arr.length:số hàng - row
            for (int j = 0; j < arr[0].length; j++) { //arr[0].length: số cột
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        //For each: chỉ dùng để truy xuất.

//        for (int[] x : arr){
//            for(int y: x){
//                System.out.println(y + " ");
//            }
//            System.out.println();
//        }


        //Mảng Zigzag

        int[][] arr3 = new int[10][];
        for (int i = 0; i < arr3.length; i++) {
            arr3[i] = new int[i + 1];
            for (int j = 0; i < arr3[i].length; j++) {
                arr3[i][j] = i+j;
            }
        }

        for (int i = 0; i < arr3.length; i++) {
            for (int j = 0; j < arr3[i].length; j++) {
                System.out.print(arr3[i][j] + " ");
            }
            System.out.println();
        }


    }
}
