package 实验四.HashSet_TreeSet;

public class Student implements Comparable{
    private String name;
    private int age;
    private int id;
    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student(String name, int age, int id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    @Override
    public String toString() {
        return name + ":" + age+ "\t学号："+id;
    }

    @Override
    public int compareTo(Object o) {
        Student s = (Student)o;
        if(this.age - s.age>0){//根据年龄的大小进行排序
            return 1;
        }
        if (this.age == s.age){//如果年龄相同，就按照名字的排序
            return this.name.compareTo(s.name);
        }
        return -1;
    }
}
