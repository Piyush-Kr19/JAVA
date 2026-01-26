package Marketing;

import General.employee;

public class sales extends employee {

    public sales(int empid, String ename, double basic) {
        super(empid, ename, basic);
    }

    // Travelling Allowance = 5% of total earnings
    public double tallowance() {
        return 0.05 * earnings();
    }

    public double totalEarning() {
        return earnings() + tallowance();
    }
}
