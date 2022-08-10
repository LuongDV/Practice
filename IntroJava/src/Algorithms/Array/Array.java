package Algorithms.Array;

public class Array {
    /*31

Mảng một chiều trong ngôn ngữ Java:
- Định nghĩa, đặc điểm
- KHai báo, khởi tạo.
- Giá trị mặc định của từng kiểu mảng.
- Lấy số phần tử của mảng hiện thời.
- Truy xuất thông tin của các phần tử của mảng.

==> chỉ sử dụng phần tử trong mảng (0 -> length-1)
     */
    public static void main(String[] args) {
        int[] arr = new int[100];
        int n = arr.length;
        for(int i = 0; i < n; i++ ){
            System.out.println(arr[i] + " ");
            if(i % 20 == 0){
                System.out.println();
            }
        }
    }
//    arr[1]= 1;
//    int x = arr[1]

}
