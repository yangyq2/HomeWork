package 作业四.学生信息管理系统;

public class Birthdate {
    int year;
    int month;
    int day;

    public Birthdate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    @Override
    public String toString() {
        return "出生日期{" +
                "年份=" + year +
                ", 月份=" + month +
                ", 日=" + day +
                '}';
    }
}
