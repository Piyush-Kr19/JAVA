// Program to sort the user entered list of numbers of any size

import java.util.Scanner;

public class SortNumbers{
    public static void main(String[] args)  
    {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter how many numbers you want to sort: ");
        int n = s.nextInt();

        int[] arr = new int[n];

        // System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) 
        {
            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i] = s.nextInt();
        }

        for (int i = 0; i < n - 1; i++) 
        {
            for (int j = 0; j < n - 1 - i; j++) 
            {
                if (arr[j] > arr[j + 1]) 
                {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        // Step 4: Print sorted numbers
        System.out.println("Sorted numbers:");
        for (int i = 0; i < n; i++) 
        {
            System.out.print(arr[i] + " ");
        }
    }
}
