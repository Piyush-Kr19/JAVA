// 5.Find the no. of occurrence of each element in a user entered list of nos.

import java.util.Scanner;

public class Repeat {
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter how many numbers you want to input: ");
        int n = s.nextInt();

        int[] arr = new int[n];
        int[] freq = new int[n];
        boolean[] visited = new boolean[n];

        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) 
        {
            arr[i] = s.nextInt();
            freq[i] = 1; // Initialize frequency to 1
            visited[i] = false; // Initialize visited to false
        }

        // Count occurrences
        for (int i = 0; i < n; i++) 
        {
            if (!visited[i]) 
            {
                for (int j = i + 1; j < n; j++) 
                {
                    if (arr[i] == arr[j]) 
                    {
                        freq[i]++;
                        visited[j] = true; // Mark as visited
                    }
                }
            }
        }

        // Print occurrences
        System.out.println("Number of occurrences of each element:");
        for (int i = 0; i < n; i++) 
        {
            if (!visited[i]) 
            {
                System.out.println(arr[i] + " occurs " + freq[i] + " time(s)");
            }
        }
    }
}