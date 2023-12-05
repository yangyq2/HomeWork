package 面向对象实验二._04公司的雇员分类;

public class SalesEmployee extends Employee{
    double monthlySales;
    double commissionRate;

    public SalesEmployee(String name, int birthMonth, double monthlySales, double commissionRate) {
        super(name, birthMonth);
        this.monthlySales = monthlySales;
        this.commissionRate = commissionRate;
    }

    @Override
    public double getSalary(int month) {
        return month == birthMonth ? monthlySales * commissionRate + 100 :
                monthlySales * commissionRate;
    }
}
