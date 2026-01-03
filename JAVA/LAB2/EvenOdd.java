import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) 
    {
        
        int number;
        int evenCount = 0;
        int oddCount = 0;

        Scanner s = new Scanner(System.in);

        System.out.print("Enter 10 numbers:");
        
        for (int i = 1; i <= 10; i++) 
        {
            
            number = s.nextInt();
            if (number % 2 == 0) 
                evenCount++;
            else 
                oddCount++;
        }

        System.out.println("Even numbers count: " + evenCount);
        System.out.println("Odd numbers count: " + oddCount);
    }
    
}
