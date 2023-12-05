package 作业四.学生信息管理系统;

import java.util.HashMap;
import java.util.Scanner;

public class StudentManagementSystem {
    static HashMap<String,Student> studentMapByName = new HashMap<>();
    static HashMap<String,Student> studentMapById = new HashMap<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("请输入操作：1-添加学生，2-删除学生，3-查找学生，4-修改学生信息，5-模糊查询，6-显示全部学生信息，7-退出");
            int operation = scanner.nextInt();
            switch (operation) {
                case 1:
                    addStudent(scanner);
                    break;
                case 2:
                    deleteStudent(scanner);
                    break;
                case 3:
                    findStudent(scanner);
                    break;
                case 4:
                    updateStudent(scanner);
                    break;
                case 5:
                    fuzzySearch(scanner);
                    break;
                case 6:
                    showStudent(scanner);
                    break;
                case 7:
                    System.exit(0);
                default:
                    System.out.println("无效的操作，请重新输入");
            }
        }
    }
    static void showStudent(Scanner scanner){
        for(String str:studentMapById.keySet()){
            System.out.println("学生信息："+studentMapById.get(str));
        }
    }
    private static void deleteStudent(Scanner scanner) {
        System.out.println("请输入要删除的学生学号或姓名：");
        String input = scanner.next();
        Student student = studentMapById.get(input);
        if (student != null) {
            System.out.println(student);
            System.out.println("是否继续删除该学生 y/n");
            char inputChar = scanner.next().charAt(0);
            if (inputChar == 'y' || inputChar == 'Y') {
                studentMapById.remove(input);
                System.out.println("删除成功");
            } else if (inputChar == 'n' || inputChar == 'N') {
                System.out.println("未删除该学生信息，返回主界面");
            } else {
                System.out.println("你的输入有误");
            }
        } else {
            student = studentMapByName.get(input);
            if (student != null) {
                System.out.println(student);
                System.out.println("是否继续删除该学生 y/n");
                char inputChar = scanner.next().charAt(0);
                if (inputChar == 'y' || inputChar == 'Y') {
                    studentMapById.remove(input);
                    System.out.println("删除成功");
                } else if (inputChar == 'n' || inputChar == 'N') {
                    System.out.println("未删除该学生信息，返回主界面");
                } else {
                    System.out.println("你的输入有误");
                }
            } else {
                System.out.println("未找到该学生信息");
            }
        }
    }

    private static void findStudent(Scanner scanner) {
        System.out.println("请输入要查找的学生学号或姓名：");
        String input = scanner.next();
        Student student = studentMapById.get(input);
        if (student != null) {
            System.out.println(student);
        } else {
            student = studentMapByName.get(input);
            if (student != null) {
                System.out.println(student);
            } else {
                System.out.println("未找到该学生信息");
            }
        }
    }

    private static void updateStudent(Scanner scanner) {
        System.out.println("输入要修改学生的姓名或学号：");
        String input = scanner.next();
        Student student = studentMapById.get(input);
        if (student != null) {
            System.out.println(student);
            studentMapById.remove(input,student);//删除之前存入的学生信息

            System.out.println("输入修改后学生的姓名：");
            String name = scanner.next();
            System.out.println("输入修改后学生的年龄：");
            int age = scanner.nextInt();
            System.out.println("输入修改后学生的学号：");
            String id = scanner.next();
            System.out.println("输入修改后学生的出生日期：");
            String birthdate = scanner.next();
            System.out.println("输入修改后学生的专业：");
            String domain = scanner.next();
            System.out.println("输入修改后学生的年级：");
            String grade = scanner.next();
            Student studentTemp = new Student(name,age,id,birthdate,domain,grade);
            studentMapById.put(id,studentTemp);
            System.out.println(studentTemp);//显示修改后的学生信息
        } else {
            student = studentMapByName.get(input);
            if (student != null) {
                System.out.println(student);
                studentMapByName.remove(input,student);

                System.out.println("输入修改后学生的姓名：");
                String name = scanner.next();
                System.out.println("输入修改后学生的年龄：");
                int age = scanner.nextInt();
                System.out.println("输入修改后学生的学号：");
                String id = scanner.next();
                System.out.println("输入修改后学生的出生日期：");
                String birthdate = scanner.next();
                System.out.println("输入修改后学生的专业：");
                String domain = scanner.next();
                System.out.println("输入修改后学生的年级：");
                String grade = scanner.next();
                Student studentTemp = new Student(name,age,id,birthdate,domain,grade);
                studentMapByName.put(name,studentTemp);
                System.out.println(studentTemp);
            } else {
                System.out.println("未找到该学生信息");
            }
        }
    }

    //模糊查询
    private static void fuzzySearch(Scanner scanner) {
        System.out.println("请输入要模糊查询的关键字：");
        String keyword = scanner.next();
        for (Student student : studentMapById.values()) {
            if (student.getId().contains(keyword) || student.name.contains(keyword)) {
                System.out.println(student);
            }
        }
    }
    //添加学生
    private static void addStudent(Scanner scanner) {
        System.out.println("输入添加学生的姓名：");
        String name = scanner.next();
        System.out.println("输入添加学生的年龄：");
        int age = scanner.nextInt();
        System.out.println("输入添加学生的学号：");
        String id = scanner.next();
        System.out.println("输入添加学生的出生日期：");
        String birthdate = scanner.next();
        System.out.println("输入添加学生的专业：");
        String domain = scanner.next();
        System.out.println("输入添加学生的年级：");
        String grade = scanner.next();
        Student student = new Student(name,age,id,birthdate,domain,grade);
        studentMapById.put(id,student);
        studentMapByName.put(name,student);
        System.out.println("学生添加成功！");
    }

}
