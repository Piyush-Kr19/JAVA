
import java.util.Scanner;
import Marketing.sales;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the employee id and emploee name");
        int empid = sc.nextInt();
        String ename = sc.next();

        System.out.println("Enter the basic salary");
        double basic = sc.nextDouble();

        sales s = new sales(empid, ename, basic);

        System.out.println("The emp id of the employee is " + empid);
        System.out.println("Total Earnings: " + s.totalEarning());
    }
}

