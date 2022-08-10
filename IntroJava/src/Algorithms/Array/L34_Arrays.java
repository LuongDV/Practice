package Algorithms.Array;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class L34_Arrays {
/*
- Sắp xếp mảng
- Điển phẩn tử mặc định
- Tìm kiếm nhị phân.
- Copy 1 mảng sang các mảng khác.
 */

    public static void main(String[] args) {
        int[] arr = new int[]{5,4,3,4,3,4,3,4,3,4,3,4};
        String[] names = {"Dinh", "Van", "Luong"};
        String res = Arrays.toString(names);
        System.out.println("trước khi sắp xếp: " + res);


//        Arrays.sort(names); //tăng dần
//
////        Arrays.sort(names, Collections.reverseOrder()); //Sắp xếp theo giảm dần.
//
//        int index = Arrays.binarySearch(names, "Luong");
//        System.out.println("Sau khi sắp xếp: ");
//        System.out.println(Arrays.toString(names));
//
//        System.out.println("Index = " + index);

        String[] name2 = Arrays.copyOf(names,3);

        System.out.println("Names = " + Arrays.toString(names));
        System.out.println("Name2 = " + Arrays.toString(name2));
        System.out.println("is names equals name2? " + Arrays.equals(names,name2));

        int[] myArray = new int[20];
        Arrays.fill(myArray,99);
        System.out.println(Arrays.toString(myArray));
    }
}
