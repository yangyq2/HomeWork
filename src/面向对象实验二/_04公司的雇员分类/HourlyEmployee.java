package 面向对象实验二._04公司的雇员分类;

public class HourlyEmployee extends Employee{
    private double hourlyRate;
    private int hoursWorked;

    public HourlyEmployee(String name, int birthMonth, double hourlyRate, int hoursWorked) {
        super(name, birthMonth);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double getSalary(int month) {
        double salary = hourlyRate * hoursWorked;
        if (hoursWorked > 160) {
            salary += (hoursWorked - 160) * hourlyRate * 1.5;
        }
        return month == birthMonth ? salary + 100 : salary;
    }
}
