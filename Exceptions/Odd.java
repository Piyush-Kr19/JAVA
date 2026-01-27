/*Write a Java program to create a method that takes an integer as a parameter
and throws a custom exception if the number is odd.*/

import java.util.Scanner;

class OddException extends Exception {
    public OddException(String message) {
        super(message);
    }
}


public class Odd {
    public static void checkEven(int number) throws OddException {
        if (number % 2 != 0) {
            throw new OddException("Exception: The number " + number + " is odd.");
        } else {
            System.out.println("The number " + number + " is even.");
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = s.nextInt();

        try {
            checkEven(num);
        } catch (OddException e) {
            System.out.println(e.getMessage());
        } 
        
    }
}