// Find the largest among 3 user entered nos. at the command prompt using Java

import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {

        int arr[];

        arr = new int[3];
        Scanner s = new Scanner(System.in);

        System.out.println("Enter 3 numbers:");

        for (int i = 0; i < 3; i++) 
        {
            arr[i] = s.nextInt();
        }

        int max = arr[0];
        
        for (int i = 1; i < 3; i++)  
        {
            if (arr[i] > max) 
            { 
                max = arr[i];
            }
        }
        System.out.println("The largest number is: " + max);
    }
}