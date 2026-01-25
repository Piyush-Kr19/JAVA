package Marketing;

import General.employee;

public class sales extends employee {

    public sales(int empid, String ename, double basic) {
        super(empid, ename, basic);
    }

    public double tallowance() {
        return 0.05 * earnings();
    }

    public void display() {
        double totalEarnings = earnings() + tallowance();

        System.out.println("Employee ID: " + empid);
        displayName();
        System.out.println("Total Earnings (including TA): " + totalEarnings);
    }
}

