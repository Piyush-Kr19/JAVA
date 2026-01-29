/*Write a Java program to generate an ArrayIndexOutofBoundsException
and handle it using catch statement.*/

import java.util.Scanner;

public class ArrayIndexExceptionDemo {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Enter size of the array: ");
        int size = s.nextInt();

        int arr[] = new int[size];

        System.out.println("Enter " + size +  " elements in array:");
        for(int i = 0; i < size; i++)
        {
            arr[i] = s.nextInt();
        }

        System.out.print("Enter index to access: ");
        int index = s.nextInt();

        try {
            // Trying to access an index that does not exist
            System.out.println("Element at index " + index + " is: " + arr[index]);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception caught: Array index is out of range!");
        }

        System.out.println("Program continues after exception handling.");
    }
}
