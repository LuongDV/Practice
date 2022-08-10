package Basic.chap2_ElementaryProgram;

import java.util.Scanner;

public class ComputeAverate {
    public static void main(String[] args) {
        //Create a Scanner object
        Scanner input = new Scanner(System.in);
        // Prompt the user to enter three numbers
        System.out.println("enter 3 numbers: ");
        double number1 = input.nextDouble();
        double number2 = input.nextDouble();
        double number3 = input.nextDouble();

        //compute average
        double average = (number1 + number2 + number3)/3;

        System.out.println("the average of" +number1 + " "
                + number2 + " " + number3 + "is" + average);
    }
}
