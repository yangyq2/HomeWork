package 面向对象实验二._04公司的雇员分类;

public class SalariedEmployee extends Employee {
    private double monthlySalary;

    public SalariedEmployee(String name, int birthMonth, double monthlySalary) {
        super(name, birthMonth);
        this.monthlySalary = monthlySalary;
    }

    @Override
    public double getSalary(int month) {
        return month == birthMonth ?
                monthlySalary + 100 : monthlySalary;
    }
}
