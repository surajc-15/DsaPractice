package com.suraj.wrapperclasses;

public class IntegerClass {
    public static void main(String[] args) {
        // Example of using Integer class methods
        Integer num1 = 100; // Autoboxing
        Integer num2 = 200;

        // Comparing two Integer objects
        int comparisonResult = num1.compareTo(num2);
        System.out.println("Comparison Result: " + comparisonResult); // -1 because 100 < 200

        // Converting Integer to String
        String num1String = num1.toString();
        System.out.println("Integer to String: " + num1String);

        // Parsing a String to an Integer
        String strNumber = "300";
        Integer parsedNumber = Integer.parseInt(strNumber);
        System.out.println("Parsed Number: " + parsedNumber);

        // Checking if a number is even or odd
        if (num1 % 2 == 0) {
            System.out.println(num1 + " is even.");
        } else {
            System.out.println(num1 + " is odd.");
        }
        if (num2 % 2 == 0) {
            System.out.println(num2 + " is even.");
        } else {
            System.out.println(num2 + " is odd.");
        }
    }
}
