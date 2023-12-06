package 面向对象作业二.Test2_1;
//老师类
public class Teacher {
    private String name;
    private int age;

    public Teacher() {
    }

    public Teacher(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void speak() {
        System.out.println("我是老师，我叫"+getName()+",我"+getAge()+"岁。");
    }
}
