package Algorithms.Array;

public class L32foreach {
    public static void main(String[] args) {
        String name = "Dinh Van Luong";
        String[] names = name.split("");
        int[] values = {1, 2, 3, 4, 5,6,7,8,9};
//        for(kieu:tenmang/danh_sach)
        for(int x : values){
            System.out.println("name :" + x);
        }
//        for(String mName : names){
//            System.out.println("name :" + mName);
//        }
    }
}
// kiem tra gia tri.
//ham foreach.


