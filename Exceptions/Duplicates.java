/*Write a Java program that reads a list of integers from the user and throws a
custom exception if any numbers are duplicates.*/

import java.util.HashSet;
import java.util.Scanner;

// Custom Exception class
class DuplicateNumberException extends Exception {
    public DuplicateNumberException(String message) {
        super(message);
    }
}

public class Duplicates {

    // Method to check duplicates
    static void checkDuplicates(int[] arr) throws DuplicateNumberException {

        HashSet<Integer> set = new HashSet<>();

        for (int num : arr) {
            if (!set.add(num)) {
                throw new DuplicateNumberException(
                        "Exception: Duplicate number found -> " + num);
            }
        }

        System.out.println("No duplicate numbers found.");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        try {
            checkDuplicates(arr);
        } catch (DuplicateNumberException e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}
