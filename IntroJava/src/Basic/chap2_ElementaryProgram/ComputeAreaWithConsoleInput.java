package Basic.chap2_ElementaryProgram;

import java.util.Scanner;
public class ComputeAreaWithConsoleInput {
    public static void main(String[] args) {
        //Create a Scanner object
        Scanner input = new Scanner(System.in);

        //prompt the user to enter a radius
        System.out.print("Enter a number for radius: ");
        double radius = input.nextDouble(); //read a double

        //compute area
        double area = radius * radius * 3.14;
        //Display results
        System.out.println("The area for the circle of radius" + radius + "is" + area);
    }
}
