import java.util.Scanner;

public class PerfectSquare {
    public static void main(String[] args) {
        int num;

        Scanner s = new Scanner(System.in);

        System.out.print("Enter a number:");
        num = s.nextInt();

        if (num >= 0) {
            int root = (int) Math.sqrt(num);
            if (root * root == num)
                System.out.println(num + " is a perfect square.");
            else
                System.out.println(num + " is not a perfect square.");
        }

        else {
            System.out.println(num + "is not a perfect square(negative value)");
        }
    }
}
