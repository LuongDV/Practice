package Algorithms.Array;

public class L33 {
    //Khởi tạo các phần tử của mảng.
    public static void main(String[] args) {
//Cách 1:
// int[] arr = {1,2,3,4,5,6,7,8,9};
//Cahcs 2:
        int[] arr = new int[]{1,2,3,4,5,6,7,3,2,8,9,3};
        int len = arr.length;

        //Cách 3:
        int[] b = new int[20];
        for(int i = 0 ; i < b.length; i++){
            b[i] = 1;
        }

        for(int i : b){
            System.out.println(i + " ");
        }
    }
}
