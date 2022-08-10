package Basic.chap4_MathematicalFunction;

import java.util.Scanner;

public class Example {
//        //ComputeAngles
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter three points: ");
//        double x1 = input.nextDouble();
//        double y1 = input.nextDouble();
//        double x2 = input.nextDouble();
//        double y2 = input.nextDouble();
//        double x3 = input.nextDouble();
//        double y3 = input.nextDouble();
//
//        // Compute three sides
//        double a = Math.sqrt((x2-x3)*(x2-x3) + (y2-y3)*(y2-y3));
//        double b = Math.sqrt((x1-x3)*(x1-x3) + (y1-y3)*(y1-y3));
//        double c = Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
//
//        //compute three angles
//        Double A = Math.toDegrees(Math.acos((a*a - b*b - c*c )/ (-2*b*c)));
//        Double B = Math.toDegrees(Math.acos((b*b - a*a - c*c )/ (-2*a*c)));
//        Double C = Math.toDegrees(Math.acos((c*c - b*b - a*a )/ (-2*a*b)));
//
//        //Display the results
//        System.out.println("Three angles are: " + Math.round(A*100)/100.0 + " " + Math.round(B*100)/100.0 + " " + Math.round(C*100)/100.0);
//}


//4.4.1 Getting String Length

//    public static void main(String[] args) {
//        String message = "Welcome to Java";
//        System.out.println(message.length());
//    }


//    4.4.2 Getting Characters from a String
//    message.charAt(0) message.charAt(14)


    //Concatenating Strings : nối, kết hợp
//    String s3 = s1.concat(s2); //

//    4.4.4 Converting Strings
//"Welcome".toLowerCase() returns a new string welcome.
//            "Welcome".toUpperCase() returns a new string WELCOME.


    //4.4.5 Reading a String from the Console
//    Scanner input = new Scanner(System.in);
//    System.out.print("Enter three words separated by spaces: ");
//    String s1 = input.next();
//    String s2 = input.next();
//    String s3 = input.next();
//    System.out.println("s1 is "+s1);
//    System.out.println("s2 is "+s2);
//    System.out.println("s3 is "+s3);

//Reading a Character from the Console
//Scanner input = new Scanner(System.in);
//System.out.print("Enter a character: ");
//    String s = input.nextLine();
//    char ch = s.charAt(0);
//System.out.println("The character entered is " + ch);


//    4.4.6 Reading a Character from the Console
//Scanner input = new Scanner(System.in);
//System.out.print("Enter a character: ");
//    String s = input.nextLine();
//    char ch = s.charAt(0);
//System.out.println("The character entered is " + ch);


//4.4.7: Compare String //Compare: include the numbers and the alphabet. smaller mean '<'
//    public static void main(String[] args) {
//        //OrderTwoCitis
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter the first city: ");
//        String city1 = input.nextLine();
//
//        System.out.println("Enter the second city: ");
//        String city2 = input.nextLine();
//
//        if(city1.compareTo(city2) < 0){ // compare the city1 and the city2
//            System.out.println("The cities in alphebetical order are " + city1 + city2);
//        } else {
//            System.out.println("The cities in alphabetical order are " + city2 + city1);
//        }
//    }


//    4.4.8 Obtaining Substrings //concat the substring and connect it to the other string
//String message = "Welcome to Java";
//    String message = message.substring(0, 11) + "HTML";
//    The string message now becomes Welcome to HTML


//4.4.9 Finding a Character or a Substring in a String
//    indexOf , lastIndexOf

// 4.4.10 Conversion between Strings and Numbers
//int intValue = Integer.parseInt(intString);
//double doubleValue = Double.parseDouble(doubleString);

    //s1.startsWith("Wel")


//
//    String s1 = "Welcome to Java";
//    String s2 = "Programming is fun";
//    String s3 = "Welcome to Java";
//    What are the results of the following expressions?
//            (a) s1 == s2
//            (b) s2 == s3
//            (c) s1.equals(s2)
//            (d) s1.equals(s3)
//            (e) s1.compareTo(s2)
//            (f) s2.compareTo(s3)
//            (g) s2.compareTo(s2)
//            (h) s1.charAt(0)
//            (i) s1.indexOf('j')
//            (j) s1.indexOf("to")
//            (k) s1.lastIndexOf('a')
//            (l) s1.lastIndexOf("o", 15)
//            (m) s1.length()
//            (n) s1.substring(5)
//            (o) s1.substring(5, 11)
//            (p) s1.startsWith("Wel")
//            (q) s1.endsWith("Java")
//            (r) s1.toLowerCase()
//            (s) s1.toUpperCase()
//            (t) s1.concat(s2)
//            (u) s1.contains(s2)
//            (v) "\t Wel \t".trim()


//    public static void main(String[] args) {
//        System.out.println("1" + 1); //11
//        System.out.println('1' + 1); //50
//        System.out.println("1" + 1 + 1);  //111
//        System.out.println("1" + (1 + 1));  //12
//        System.out.println('1' + 1 + 1);  //51
//    }

//    public static void main(String[] args) {
//        System.out.println(1 + " Welcome " + 1 + 1); //11
//        System.out.println('1' + 1); //50
//        System.out.println("1" + 1 + 1);  //111
//        System.out.println("1" + (1 + 1));  //12
//        System.out.println('1' + 1 + 1);  //51
//    }
//
//    1 + "Welcome " + 1 + 1
//            1 + "Welcome " + (1 + 1)
//            1 + "Welcome " + ('\u0001' + 1)
//            1 + "Welcome " + 'a' + 1


//    4.20
//    public static void main(String[] args) {
//        String s1 = " Welcome ";
//        String s2 = " welcome ";
//        boolean isEqual{
//            System.out.println(s1.equals(s2));
//        }
//    }


    //4.5:Case Study
    //hỏi ngày sinh của một người bạn bằng 5 câu hỏi.

    //GuessBirthday.java
    public static void main(String[] args) {
        String set1 =
                " 1  3  5  7\n" +
                " 9 11 13 15\n" +
                "17 19 21 23\n" +
                "25 27 29 31";
        String set2 =
                " 2  3  6  7\n" +
                "10 11 14 15\n" +
                "18 19 22 23\n" +
                "26 27 30 31";
        String set3 =
                " 4  5  6  7\n" +
                "12 13 14 15\n" +
                "20 21 22 23\n" +
                "28 29 30 31";
        String set4 =
                " 8  9  10 11\n" +
                "12 13 14 15\n" +
                "24 25 26 27\n" +
                "28 29 30 31";
        String set5 =
                "16 17 18 19\n" +
                "20 21 22 23\n" +
                "24 25 26 27\n" +
                "28 29 30 31";


        int day = 0;

        Scanner input = new Scanner(System.in);

        //Prompt the user to answer the questions
        System.out.println("Is your birthday in Set1?\n");
        System.out.println(set1);
        System.out.println("\nEnter 0 for No and 1 for Yes: ");
        int answer = input.nextInt();

        if(answer == 1)
            day +=1; // day = day + 1

        //Prompt the user to answer the questions
        System.out.println("Is your birthday in Set2?");
        System.out.println(set2);
        System.out.println("\nEnter 0 for No and 1 for Yes: ");
        answer = input.nextInt();

        if(answer == 1)
            day +=2; // day = day + 1

        //Prompt the user to answer the questions
        System.out.println("Is your birthday in Set3?");
        System.out.println(set3);
        System.out.println("\nEnter 0 for No and 1 for Yes: ");
        answer = input.nextInt();


        if(answer == 1)
            day +=4; // day = day + 1

        //Prompt the user to answer the questions
        System.out.println("Is your birthday in Set4?");
        System.out.println(set4);
        System.out.println("\nEnter 0 for No and 1 for Yes: ");
        answer = input.nextInt();


        if(answer == 1)
            day +=8; // day = day + 1

        //Prompt the user to answer the questions
        System.out.println("Is your birthday in Set5?");
        System.out.println(set5);
        System.out.println("\nEnter 0 for No and 1 for Yes: ");
        answer = input.nextInt();

        if(answer ==1)
            day += 16;
        System.out.println("your birthday is " + day );
    }

    //cơ mà tại sao họ lại có thể sắp xếp được tất cả những set đó, săp xếp theo trật tựu đó ?
    // why they arrange these sets in the perfect order?
    // => các số được sắp xếp theo một trật tự nhất định. Những số đầu tiên của mỗi set là 1, 2, 4, 8, 16. tương đương với 1, 10, 100, 1000 , 10000
    //trong hệ số nhị phân. số nhị phân từ 1 -> 31 có nhiều nhất là 5 chữ số. Đặt 5 số đó là : b5b4b3b2b1 = b50000 + b4000 + b300 + b20 + b1.
    //nếu một ngày của số nhị phân có một chữ số là : 1 trong b(k) thì số đó sẽ xuất hiện trong Set(k).
    //Ví dụ như là : số 19 trong hệ số nhị phân là : 10011, nghĩa là nó xuất hiện trong Set1, Set2, Set5. Số nhị phân của nó là 1 + 10 + 10000 = 10011
    // hoặc trong hệ thập phân là 1 + 2 + 16 = 19. số 31 : 11111, nghĩa là nó xuất hiện trong cả 5 Set. Số nhị phân của 31 là : 1 +2 +4 +5 +16 = 31




//    1, 2, 4, 8, and 16, which correspond to 1, 10, 100, 1000, and 10000
//    in binary (binary numbers are introduced in Appendix F, Number Systems).


    //Converting a Hexadecimal Digit to a Decimal Value

//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.print("Enter a hex digit: ");
//        String hexString = input.nextLine();
//
////         Check if the hex string has exactly one character
//        if (hexString.length() != 1) {
//            System.out.println("You must enter exactly one character");
//            System.exit(1);
//        }
//
//        // Display decimal value for the hex digit
//        char ch = hexString.charAt(0);
//        if (ch <= 'F' && ch >= 'A') {
//            int value = ch - 'A' + 10;
//            System.out.println("The decimal value for hex digit "
//                     + ch + " is " + value);
//        } else if (Character.isDigit(ch)) {
//            System.out.println("The decimal value for hex digit "
//                    + ch + " is " + ch);
//        } else {
//            System.out.println(ch + " is an invalid input");
//        }
//    }








    //4.6 Formatting Console Output
//    However, the format is still not correct. There should be two digits after the decimal point:
//            16.40 rather than 16.4. You can fix it by using the printf method, like this:
//    double amount = 12618.98;
//    double interestRate = 0.0013;
//    double interest = amount * interestRate;
//System.out.printf("Interest is $%4.2f",
//    interest);


//    %b a Boolean value true or false
//            %c a character ‘a’
//            %d a decimal integer 200
//            %f a floating-point number 45.460000
//            %e a number in standard scientific notation 4.556000e+01
//            %s a string “Java is cool”

}





























