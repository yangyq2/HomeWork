package 实验四.HashMap_TreeMap;

import java.util.Comparator;
import java.util.HashMap;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        /*
        6.创建HashMap对象，存入 4 组 学号—学生对 元素，根据输入学号，获取对应学生信息；
            创建 KeySet集合，使用Iterator遍历的方式获取输出所有 key—value 对。
         */
        HashMap<Integer, Student> hashMap = new HashMap<>();
        Student s1 = new Student("小明", 10, 190);
        Student s2 = new Student("小红", 13, 101);
        Student s3 = new Student("小蓝", 14, 232);
        Student s4 = new Student("小绿", 14, 153);
        hashMap.put(1, s1);
        hashMap.put(2, s2);
        hashMap.put(3, s3);
        hashMap.put(4, s4);
        for (int key : hashMap.keySet()) {
            System.out.println("学生编号:" + key + "\t学生信息:" + hashMap.get(key));
        }
        System.out.println("-------------------------------------------");

        //7.创建TreeMap对象，存入4组 学号—成绩对元素，利用 二叉树 特性按成绩由高到低进行排序
        TreeMap<Student, Integer> treeMap = new TreeMap<>(new Comparator<>() {
            @Override
            public int compare(Student o1, Student o2) {

                return Integer.compare(o2.getScore(), o1.getScore());//成绩从高到低排序
            }

        });

        // 将学号和成绩作为键值对存入TreeMap
        treeMap.put(s1, 1);
        treeMap.put(s2, 2);
        treeMap.put(s3, 3);
        treeMap.put(s4, 4);
//
        for (Student key : treeMap.keySet()) {
            System.out.println("学生信息:" + key + "\t学号：" + treeMap.get(key));
        }
    }
}
