//*3.Write a Java class which has a method called ProcessInput. This method checks the number entered by the user.
//*If the entered number is negative then throw an user defined exception called NegativeNumberException,
//*otherwise it displays the double value of the entered number.

import java.util.Scanner;

// ? User-defined exception
class NegativeNumberException extends Exception {
    public NegativeNumberException(String message) {
        super(message);
    }
}

public class UserDefinedExceptionDemo {

    // ? Method  Created 
    static void processInput(int num) throws NegativeNumberException {

        if (num < 0) {
            throw new NegativeNumberException("Negative number entered!"); //! Exception
        } else {
            System.out.println("Double value: " + (num * 2));
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        try {
            processInput(number);
        }
        catch (NegativeNumberException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }

    }
}
