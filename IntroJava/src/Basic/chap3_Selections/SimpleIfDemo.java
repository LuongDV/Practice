package Basic.chap3_Selections;

import java.util.Scanner;

public class SimpleIfDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int number = input.nextInt();

        if(number % 5 == 0){
            System.out.println("làm tốt lắm =)) ");
        }

        if(number % 2 == 0) {
            System.out.println("HiEven");
        }
    }
}
