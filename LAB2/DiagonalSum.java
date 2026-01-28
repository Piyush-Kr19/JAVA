// Find sum of each diagonal (left & right) elements separately of a user entered 3 X 3 matrix in Java

import java.util.Scanner;

public class DiagonalSum { 
    public static void main(String[] args)
    {
        int matrix[][] = new int[3][3];
        int leftDiagonalSum = 0;
        int rightDiagonalSum = 0;

        Scanner s = new Scanner(System.in);

        System.out.println("Enter elements of 3x3 matrix:");

        for (int i = 0; i < 3; i++) 
        {
            for (int j = 0; j < 3; j++) 
            {
                matrix[i][j] = s.nextInt();
            }
        }

        for (int i = 0; i < 3; i++) 
        {
            leftDiagonalSum += matrix[i][i];
            rightDiagonalSum += matrix[i][2 - i];
        }

        System.out.println("Left Diagonal Sum: " + leftDiagonalSum);
        System.out.println("Right Diagonal Sum: " + rightDiagonalSum);
    }
}
