package Basic.chap5_Loop;

public class Example {
////what is the sum of 2 random numbers?
//    public static void main(String[] args) {
//        int number1 = (int)(Math.random() *10);
//        int number2 = (int)(Math.random() * 10);
//
//        Scanner input = new Scanner(System.in);
//
//        System.out.println("What is " + number1 + " + " + number2 + "?");
//
//        int answer = input.nextInt();
//
//        while (number1 + number2 != answer){
//            System.out.println("Wrong answer. Try again. What is " + number1 + "+" + number2 + "?");
//            answer = input.nextInt();
//        }
//        System.out.println("You got it!");
//    }

    //Guessing number

//    public static void main(String[] args) {
//        int number = (int)(Math.random() * 101);
//
//        Scanner input = new Scanner(System.in);
//        System.out.println("Guessing the number from 0 - 100");
//        int guess = -1;
//        while (guess != number){
//            System.out.println("Enter your guess number: ");
//            guess = input.nextInt();
//
//            if(guess == number){
//                System.out.println(" Đoán trúng cmnr =))");
//            }
//            else if( guess > number){
//                System.out.println(" Cao quá, số thấp thấp thôi :");
//            }
//            else {
//                System.out.println(" số thấp quá, đoán lại số cao hơn đê : ");
//            }
//        }
//    }


//    5.4 SubtractionQuizLoop.java
//    public static void main(String[] args) {
//        final int NUMBER_OF_QUESTIONS = 5; // Number of questions
//        int correctCount = 0; // Count the number of correct answers
//        int count = 0; // Count the number of questions
//        long startTime = System.currentTimeMillis();
//        String output = " "; // output string is initially empty
//        Scanner input = new Scanner(System.in);
//
//        while (count < NUMBER_OF_QUESTIONS) {
//            // 1. Generate two random single-digit integers
//            int number1 = (int) (Math.random() * 10);
//            int number2 = (int) (Math.random() * 10);
//
//            // 2. If number1 < number2, swap number1 with number2
//            if (number1 < number2) {
//                int temp = number1;
//                number1 = number2;
//                number2 = temp;
//
//            }
//
//            // 3. Prompt the student to answer "What is number1 – number2?"
//            System.out.print("What is " + number1 + " - " + number2 + "? ");
//            int answer = input.nextInt();
//
//            // 4. Grade the answer and display the result
//            if (number1 - number2 == answer) {
//                System.out.println("You are correct!");
//                correctCount++; // Increase the correct answer coun33
//            } else
//                System.out.println("Your answer is wrong.\n" + number1 + " - " + number2 + " should be " + (number1 - number2));
//
//            // Increase the question count
//            count++;
//
//            output += "\n" + number1 + "-" + number2 + "=" + answer +
//                    ((number1 - number2 == answer) ? " correct" : " wrong");
//        }
//
//        long endTime = System.currentTimeMillis();
//        long testTime = endTime - startTime;
//
//        System.out.println("Correct count is " + correctCount + "\nTest time is " + testTime / 1000 + " seconds\n" + output);
//    }


//    5.2.4 Controlling a Loop with a Sentinel Value


//    public static void main(String[] args) {
//        // Create a Scanner
//        Scanner input = new Scanner(System.in);
//
//        // Read an initial data
//        System.out.print("Enter an integer (the input ends if it is 0): ");
//        int data = input.nextInt();
//
//        // Keep reading data until the input is 0
//        int sum = 0;
//        while (data != 0) { //chú ý
//            sum += data;
//            // Read the next data 20 System.out.print"Enter an integer (the input ends if it is 0): ");
//            data = input.nextInt();
//        }
//
//        System.out.println("The sum is " + sum);
//    }


//    5.2.5 Input and Output Redirections


//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        int number, max;
//        number = input.nextInt();
//        max = number;
//        while (number != 0) {
//            number = input.nextInt();
//            if (number > max)
//                max = number;
//        }
//        System.out.println("max is " + max);
//        System.out.println("number " + number);
//    }

///////////////////////////////////////////////////////////////////////////
//    public static void main(String[] args) {
//        int x = 80000000;
//        while (x > 0)
//            x++;
//        System.out.println("x is " + x);
//    }

//    x is -2147483648
//    The reason: When a variable is assigned a value that
//    is too large (in size) to be stored, it causes overflow.
//            2147483647 + 1 is actually -2147483648


//    5.3 The do-while Loop


//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        int number, max;
//        number = input.nextInt();
//        max = number;
//        do {
//            number = input.nextInt();
//            if (number > max)
//                max = number;
//        } while (number != 0);
//        System.out.println("max is " + max);
//        System.out.println("number " + number);
//    }


//5.4 The for Loop


//5.6 Nested Loops ( loop in loop
//A loop can be nested inside another loop
//Nested loops consist of an outer loop and one or more inner loops.
// Each time the outer loop is repeated, the inner loops are reentered, and started anew.


//    public static void main(String[] args) {
//        // Display the table heading
//        System.out.println(" Multiplication Table");
//
//        // Display the number title
//        System.out.print(" ");
//        for (int j = 1; j <= 9; j++)
//            System.out.print(" " + j);
//
//        System.out.println("\n———————————————————————————————————————");
//
//        // Display table body
//        for (int i = 1; i <= 9; i++) {
//            System.out.print(i + " | ");
//            for (int j = 1; j <= 9; j++) {
//                // Display the product and align properly
//                System.out.printf("%4d", i * j);
//            }
//            System.out.println();
//        }
//    }
//
//    public static void main(String[] args) {
//        for (int i = 0; i < 10; i++)
//            for (int j = 0; j < i; j++)
//                System.out.println(  i * j);
//    }


//45 times , 9!
//    public static void main(String[] args) {
//        for (int i = 1; i < 5; i++) {
//            int j = 0;
//            while (j < i) {
//                System.out.print(j + " ");
//                j++;
//            }
//        }
//    }

//
//        public static void main(String[] args) {
//            int i = 0;
//            while (i < 5) {
//                for (int j = i; j > 1; j--)
//                    System.out.print(j + " ");
//                System.out.println("****");
//                i++;
//            }
//        }


//
//    public static void main(String[] args) {
//        int i = 5;
//        while (i >= 1) {
//            int num = 1;
//            for (int j = 1; j <= i; j++) {
//                System.out.print(num + "xxx");
//                num *= 2;
//            }
//            System.out.println();
//            i--;
//        }
//    }


//    //    Identify and fix the errors in the following code:
//    public static void main( String[] args) {
//        int sum = 0;
//        int j = 0;
//        for (int i = 0; i < 10; i++) {
//            sum += i;
//        }
//        int i = 0;
//        if (i < j) {
//
//        } else {
//            System.out.println(j);
//        }
//        while (j < 10) ;{
//            j++;
//        }
//        do {
//            j++;
//        } while (j < 10);
//    }


}
