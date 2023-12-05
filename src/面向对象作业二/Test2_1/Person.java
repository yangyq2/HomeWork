package 面向对象作业二.Test2_1;

public class Person {
    private String name;
    private double score;
    private int age;

    public Person() {
    }

    public Person(String name,  int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void speak() {
        System.out.println("我是普通人，我叫" + getName() + ",我" + getAge() + "岁。");
    }
}
