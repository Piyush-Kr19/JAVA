//*2. Write a Java program to handle an ArithmeticException using try, catch, and finally block.//* 

import java.util.Scanner;

public class ArithmeticExceptionDemo {

    static void divide(int a ,int b){

        try{
            int result = a/b;   //! Raise Arithmetic Exception 
            System.out.println("Result: " + result);
        }

        catch(ArithmeticException e){
            System.out.println("Exception raised: Divison by zero is not allowed");
        }
        
        finally{
            System.out.println("Program Terminated");
        }
    }

    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int x = s.nextInt();

        System.out.print("Enter second number: ");
        int y = s.nextInt();

        divide(x, y);
    }
    
}