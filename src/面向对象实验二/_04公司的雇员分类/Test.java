package 面向对象实验二._04公司的雇员分类;

public class Test {
    public static void main(String[] args) {
        Employee[] employees = new Employee[4];
        employees[0] = new SalariedEmployee("张三", 1, 5000);
        employees[1] = new HourlyEmployee("李四", 2, 20, 180);
        employees[2] = new SalesEmployee("王五", 3, 10000, 0.1);
        employees[3] = new BasePlusSalesEmployee
                ("赵六", 4, 3000, 12000, 0.15);

        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i].getName() + "的工资为：" + employees[i].getSalary(5));
        }
    }
}
