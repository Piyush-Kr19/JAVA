/*Create an interface ISortable with a method sort() that sorts an array of
integers in ascending order. Create two classes BubbleSort and SelectionSort
that implement the ISortable interface and provide their own
implementations of the sort() method. */

import java.util.Scanner;

interface ISortable {

    void sort(int[] arr);
}

class BubbleSort implements ISortable {

    public void sort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}

class SelectionSort implements ISortable {

    public void sort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int min_idx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min_idx]) {
                    min_idx = j;
                }
            }
            // swap arr[i] and arr[min_idx]
            int temp = arr[i];
            arr[i] = arr[min_idx];
            arr[min_idx] = temp;
        }
    }
}

public class Driver3 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = s.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }

        // Choose sorting method
        ISortable sorter = new BubbleSort();
        ISortable sorter1 = new SelectionSort();

        sorter.sort(arr);
        sorter1.sort(arr);

        System.out.println("Sorted array in ascending order using Bubble sort:");
        for (int i : arr) {
            System.out.print(i + " ");
        }

        System.out.println("\nSorted array in ascending order using Selection sort:");
        for (int i : arr) {
            System.out.print(i + " ");
        }

        s.close();
    }
}
