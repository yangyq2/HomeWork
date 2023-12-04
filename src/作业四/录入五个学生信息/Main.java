package 作业四.录入五个学生信息;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)throws MyException{
        ArrayList<Student> list = new ArrayList<>();

//        Student s1 = new Student("小牛",100,20,90);
//        Student s2 = new Student("小羊",13,20,90);
//        Student s3 = new Student("小狗",130,40,90);
//        Student s4 = new Student("小猫",130,30,100);
//        Student s5 = new Student("小猪",60,20,90);
//
//        list.add(s1);
//        list.add(s2);
//        list.add(s3);
//        list.add(s4);
//        list.add(s5);

        /*
        小牛 100 20 90 小红 100 20 90 小栏 100 20 90 小绿 100 20 90 小铁 100 20 90
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("添加五个学生的成绩信息，格式如下：\n" +
                "姓名 语文成绩 数学成绩 英语成绩");

        try{
            for (int i = 0; i < 5; i++) {
                String str = scanner.nextLine();
                String[] arr = str.split("\\s+");

                list.add(new Student(arr[0],Integer.parseInt(arr[1]),Integer.parseInt(arr[2]),
                        Integer.parseInt(arr[3])));
                if (i < 4) {
                    System.out.println("继续添加，还差"+(4-i)+"个学生");
                }
            }
        }catch(Exception e){
             throw new MyException("输入错误，请按照规定输入");
        }

        //遍历未经过排序的队列
        System.out.println("排序前的成绩信息");
        for(Student s:list){
            System.out.println(s);
        }

        Collections.sort(list);
        System.out.println("排序后的成绩信息");
        System.out.println("-----------------------------");
        for(Student s:list){
            System.out.println(s);
        }
    }
}
