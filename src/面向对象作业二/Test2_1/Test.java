package com.tmp.Demo2;

public class Test {
    public static void main(String[] args) {
            Student s1 = new Student();
            s1.setName("张三");
            s1.setAge(18);
            s1.setScore(80);
            s1.speak();

            Student s2 = new Student("李四",20,90);
            s2.speak();

            Person p1 = new Person();
            p1.setName("王五");
            p1.setAge(22);
            p1.speak();

            Person p2 = new Person("老六",23);
            p2.speak();

            Teacher t1 = new Teacher();
            t1.setName("七");
            t1.setAge(25);
            t1.speak();

            Teacher t2 = new Teacher("八",30);
            t2.speak();
    }
}
