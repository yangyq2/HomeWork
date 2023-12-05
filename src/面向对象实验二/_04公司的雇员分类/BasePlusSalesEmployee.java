package 面向对象实验二._04公司的雇员分类;

public class BasePlusSalesEmployee extends SalesEmployee{
    private double baseSalary;

    public BasePlusSalesEmployee(String name, int birthMonth, double baseSalary,
                                 double monthlySales, double commissionRate) {
        super(name, birthMonth, monthlySales, commissionRate);
        this.baseSalary = baseSalary;
    }

    @Override
    public double getSalary(int month) {
        return month == birthMonth ? baseSalary + (monthlySales * commissionRate)
                + 100 : baseSalary + (monthlySales * commissionRate);
    }
}
