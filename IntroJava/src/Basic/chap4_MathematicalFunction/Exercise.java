package Basic.chap4_MathematicalFunction;

public class Exercise {
//    public static void main(String[] args) {
//        //4.1:Geometry: area of a pentagon
//
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter the length from the center to a vertex: " );
//        double r = input.nextDouble();
//
//        double s = 2*r*(Math.sin((Math.PI)/5));
//        double area = ((5 * s * s) / (4 * (Math.tan(Math.PI/5))));
//        System.out.println("\nThe area of the pentagon is " + area );
//    }

    //4.2: Geometry: great circle distance
    //4.3: Geography: estimate areas
    //4.4 / 4.5 /  4.6


//    public static void main(String[] args) {
//        //4,10 : HexNumber
//        Scanner input = new Scanner(System.in);
//
//        // Prompt the user to enter an integer between 0 and 15
//        System.out.print("Enter a decimal value (0 to 15): ");
//        int decimal = input.nextInt();
//
//        // Display its corresponding hex number
//        if (decimal >= 0 && decimal <= 9)
//            System.out.println("The hex value is " + decimal);
//        else if (decimal >= 10 && decimal <= 15)
//            System.out.println("The hex value is " + (char)(decimal + 'A' - 10));
//        else
//            System.out.println(decimal + " is an invalid input");
//    }


//    public static void main(String[] args) {

//        //4.12 : Hex to Binary from 1-15
//        Scanner input = new Scanner(System.in);
//        // Prompt the user to enter a hex digit
//        System.out.print("Enter a hex digit: ");
//        String hexString = input.nextLine();
//        // Check if the hex string has exactly one character
//        if (hexString.length() != 1) {
//            System.out.println("You must enter exactly one character");
//            System.exit(1);
//        }
//
//        // Display binary number for the hex digit
//        char ch = hexString.charAt(0);
//        if ((ch >= 'A' && ch <= 'F') || (ch >= 0 && ch <= 9))
//        {
//            System.out.print("The binary value is ");
//            switch(ch)
//            {
//                case 0: System.out.println(0000); break;
//                case 1: System.out.println(0001); break;
//                case 2: System.out.println(0010); break;
//                case 3: System.out.println(0011); break;
//                case 4: System.out.println(0100); break;
//                case 5: System.out.println(0101); break;
//                case 6: System.out.println(0110); break;
//                case 7: System.out.println(0111); break;
//                case 8: System.out.println(1000); break;
//                case 9: System.out.println(1001); break;
//                case 'A': System.out.println(1010); break;
//                case 'B': System.out.println(1011); break;
//                case 'C': System.out.println(1100); break;
//                case 'D': System.out.println(1101); break;
//                case 'E': System.out.println(1110); break;
//                case 'F': System.out.println(1111); break;
//            }
//        }
//        else
//            System.out.println(ch + " is and invalid input");

    // Dấu nháy '' dùng để gán một giá trị không theo khuân của một biến thông thường.

    //4.13
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter a character: ");
//        String s = input.next();
//        char ch = s.charAt(0);
//        if (Character.isLetter(ch)) {
//            switch (s) {
//                case "a":
//                case "A":
//                case "U":
//                case "u":
//                case "e":
//                case "E":
//                case "O":
//                case "o":
//                case "i":
//                case "I":
//                    System.out.println(ch + " is a vowel");
//                    break;
//                default:
//                    System.out.println(ch + " is a consonant");
//            }
//        } else {
//            System.out.println("is an invalid input");
//        }
//    }


    //4.14:
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter a letter grade: ");
//        String s = input.next();
//        Character ch = s.charAt(0);
//        if (Character.isLetter(ch)) {
//            switch (s) {
//                case "A":
//                    System.out.println("The numeric value for grade A is : 4");
//                    break;
//                case "B":
//                    System.out.println("The numeric value for grade B is : 3");
//                    break;
//                case "C":
//                    System.out.println("The numeric value for grade C is : 2");
//                    break;
//                case "D":
//                    System.out.println("The numeric value for grade D is : 1 or 0");
//            }
//        } else {
//            System.out.println("Invalid letter!");
//        }
//    }

//4.16:(Random character) Write a program that displays a random uppercase letter
//using the Math.random() method.

//    public static void main(String[] args) {
//        // Generate a random number between 65 and 90
//        int number = 65 + (int)(Math.random() * (91 - 65));
//
//        // Display a random uppercase letter
//        System.out.println((char)(number)); // lấy character của number
//    }


//4.17

    //(Days of a month) Write a program that prompts the user to enter a year and the
    //first three letters of a month name (with the first letter in uppercase) and displays
    //the number of days in the month.

    //phân ra các trường hợp có số tháng giống nhau. sửa dụng hàm ?: để xác định tháng 2 trong năm nhuật hay không nhuận

//leapYear ? 29 : 28

//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//
//        // Prompt the user to enter a year and
//        // the first three letter of a month name
//        System.out.print("Enter a year: ");
//        int year = input.nextInt();
//        System.out.print("Enter a month: ");
//        String month = input.next();
//
//        // Test for leap year
//        boolean leapYear =
//                ((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0);
//
//        // Display the number of day in the month
//        System.out.print(month + " " + year + " has ");
//
//        if ( month.equals("Jan") || month.equals("Mar") ||
//                month.equals("May") || month.equals("Jul") ||
//                month.equals("Aug") || month.equals("Oct") ||
//                month.equals("Dec"))
//            System.out.println(31 + " days");
//        else if (month.equals("Apr") || month.equals("Jun") ||
//                month.equals("Sep") || month.equals("Nov"))
//            System.out.println(30 + " days");
//        else
//            System.out.println(((leapYear) ? 29 : 28) + " days");
//    }


    //4.17
    // Prompt the user to enter a year and
    // the first three letter of a month name

    // Test for leap year

    // Display the number of day in the month
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter a year from 1900: ");
//        int year = input.nextInt();
//        System.out.println("Enter a month: ");
//
//        boolean leapYear = (year % 4 || year % 400 || year )
//    }


//4.20

//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("Please enter a string: ");
//        String s = input.next();
//        System.out.println(s.length() + s.charAt(0));
//    }


//4.21

//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter a SSn: ");
//        // Prompt the user to enter a Social Security number
//        System.out.print("Enter a SSN: ");
//        String ssn = input.nextLine();
//
//        // Check whether the input is valid
//        boolean isValid =
//                (ssn.length() == 11) &&
//                        (Character.isDigit(ssn.charAt(0))) &&
//                        (Character.isDigit(ssn.charAt(1))) &&
//                        (Character.isDigit(ssn.charAt(2))) &&
//                        (ssn.charAt(3) == '-') &&
//                        (Character.isDigit(ssn.charAt(4))) &&
//                        (Character.isDigit(ssn.charAt(5))) &&
//                        (Character.isDigit(ssn.charAt(7))) &&
//                        (ssn.charAt(6) == '-') &&
//                        (Character.isDigit(ssn.charAt(8))) &&
//                        (Character.isDigit(ssn.charAt(9))) &&
//                        (Character.isDigit(ssn.charAt(10)));
//
//        // Display result
//        System.out.println(ssn + " is " + ((isValid) ? "a valid " : "an invalid ")
//                + "social security number");
//
//
//    }


    //4.22
/*
(Check substring) Write a program that prompts the user to enter two strings and
reports whether the second string is a substring of the first string.
*/

//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//
//        // Prompt the user to enter two strings
//        System.out.print("Enter string s1: ");
//        String string1 = input.nextLine();
//        System.out.print("Enter string s2: ");
//        String string2 = input.nextLine();
//
//        // Display wheater the second string
//        // is a substring of the frist string
//        System.out.println(
//                string2 + ((string1.contains(string2)) ? " is " : " is not ") +
//                        "a substring of " + string1);
//    }


//4.23
//public static void main(String[] args) {
//    Scanner input = new Scanner(System.in);
//
//    // Prompt the user to enter payroll inforation
//    System.out.print("Enter employee’s name: ");
//    String name = input.next();
//    System.out.print("Enter number of hours worked in a week: ");
//    double hoursWorked = input.nextDouble();
//    System.out.print("Enter hourly pay rate: ");
//    double hourlyPayRate = input.nextDouble();
//    System.out.print("Enter federal tax withholding rate: ");
//    double federalTaxRate = input.nextDouble();
//    System.out.print("Enter state tax withholding rate: ");
//    double stateTaxRate = input.nextDouble();
//
//    // Display payroll statement
//    double grossPay, federal, state, totalDeduction;
//    System.out.printf(
//            "Employee Name: " + name +
//                    "\nHours Worked: " + hoursWorked +
//                    "\nPay Rate: $" + hourlyPayRate +
//                    "\nGross Pay: $" + (grossPay = hoursWorked * hourlyPayRate) +
//                    "\nDeductions:\n   Federal Witholding (20.0%): $" +
//                    (federal = grossPay * federalTaxRate) +
//                    "\n   State Witholding (9.0%): $" + (state = grossPay * stateTaxRate) +
//                    "\n   Total Deduction: $" + (totalDeduction = federal + state) +
//                    "\nNet Pay: $" + (grossPay - totalDeduction)
//    );



    //4.24

//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//
//        // Prompt the user to enter three cities
//        System.out.print("Enter the first city: ");
//        String city1 = input.nextLine();
//        System.out.print("Enter the second city: ");
//        String city2 = input.nextLine();
//        System.out.print("Enter the third city: ");
//        String city3 = input.nextLine();
//
//        String temp;
//        if ((city2.compareTo(city1) < 0) && (city2.compareTo(city3) < 0))
//        {
//            temp = city1;
//            city1 = city2;
//            city2 = temp;
//        }
//        else if ((city3.compareTo(city1) < 0) && (city3.compareTo(city2) < 0))
//        {
//            temp = city1;
//            city1 = city3;
//            city3 = temp;
//
//        }
//        if (city3.compareTo(city2) < 0)
//        {
//            temp = city2;
//            city2 = city3;
//            city3 = temp;
//        }
//
//        // Display cities in ascending order
//        System.out.println("The three cities in alphabetical order are " +
//                city1 + " and " + city2 + " and " + city3);
//    }


//4.25





}
