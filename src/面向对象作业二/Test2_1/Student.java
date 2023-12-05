package com.tmp.Demo2;

//学生类
public class Student {
    private String name;
    private double score;
    private int age;

    public Student() {
    }

    public Student(String name, double score, int age) {
        this.name = name;
        this.score = score;
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
        System.out.println("我是学生，我叫"+getName()+",我"+getAge()+"岁。");
    }

}
