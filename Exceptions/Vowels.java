/*Write a Java program to create a method that takes a string as input and
throws an exception if the string does not contain vowels.*/


import java.util.Scanner;

// Custom Exception class
class NoVowelException extends Exception {
    public NoVowelException(String message) {
        super(message);
    }
}

public class Vowels {

    // Method to check vowels
    static void checkVowels(String str) throws NoVowelException {

        if (!str.matches(".*[aeiouAEIOU].*")) {
            throw new NoVowelException("Exception: String does not contain vowels");
        }

        System.out.println("String contains at least one vowel");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();   // user input

        try {
            checkVowels(input);
        } catch (NoVowelException e) {
            System.out.println(e.getMessage());
        }
        
    }
}