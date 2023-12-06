package 面向对象作业二.Test2_1;
//学校类
public class School {
    private String name;
    private final Student[] Students;
    private final Teacher[] Teachers;

    public School(String name, Student[] students, Teacher[] teachers) {
        this.name = name;
        Students = students;
        Teachers = teachers;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student[] getStudents() {
        return Students;
    }


    public Teacher[] getTeachers() {
        return Teachers;
    }

}
