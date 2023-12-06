package 作业四.学生信息管理系统;

public class Student {
    String name;
    private int age;
    private String id;//学号
    private String birthdate;//出生日期
    private String domain;//专业
    private String grade;//班级

    public Student() {
    }

    public Student(String name, int age, String id, String birthdate, String domain, String grade) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.birthdate = birthdate;
        this.domain = domain;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "姓名='" + name + '\'' +
                ", 年龄=" + age +
                ", 学号=" + id +" "+
                 ",出生日期="+birthdate +
                ", 专业='" + domain + '\'' +
                ", 年级='" + grade + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

}
