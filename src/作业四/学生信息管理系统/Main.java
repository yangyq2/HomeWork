package 作业四.学生信息管理系统;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("小明",19,101,
                new Birthdate(2002,10,19),"计科","一年级");
        Map<String,Student> map1 = new HashMap<>();//HashMap：姓名-学生实例
        Map<Integer,Student> map2 = new HashMap<>();//HashMap：学号-学生实例
        map1.put(s1.getName(),s1);

        for(String s:map1.keySet()){
            Student student = map1.get(s);
            System.out.println("通过名字来查找学生对象信息：\n"+student);
        }
    }
}
