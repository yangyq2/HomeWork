package 面向对象作业二.Test2_1;

public class Test {
    public static void main(String[] args) {
            Student s1 = new Student();
            s1.setName("张三");
            s1.setAge(18);
            s1.speak();

            Student s2 = new Student("李四",20);
            s2.speak();

            Teacher t1 = new Teacher();
            t1.setName("七");
            t1.setAge(25);
            t1.speak();

            Teacher t2 = new Teacher("八",30);
            t2.speak();

            Student[] students = new Student[]{s1,s2};
            Teacher[] teachers = new Teacher[]{t1,t2};

            School school = new School("湖北文理学院理工学院",students,teachers);
            System.out.println("学校的名字为："+school.getName());
            for (int i = 0; i < students.length; i++) {
                    System.out.println(school.getStudents()[i]);
            }
            for (int i = 0; i < teachers.length; i++) {
                    System.out.println(school.getTeachers()[i]);
            }
    }
}
