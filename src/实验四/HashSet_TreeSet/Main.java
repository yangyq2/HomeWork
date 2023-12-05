package 实验四.HashSet_TreeSet;


import java.util.HashSet;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        /*
        4.  创建HashSet集合，向其中添加 Student 类的对象实例，并输出。
        5. 创建 TreeSet集合对象，向集合中添加 Student 类的对象数据，并依据年龄和名字进行排序
         */
        Student s1 = new Student("小明",18);
        Student s2 = new Student("小李",19);
        Student s3 = new Student("小红",17);
        HashSet<Student> hashSet = new HashSet<Student>();
        hashSet.add(s3);
        hashSet.add(s1);
        hashSet.add(s2);

        //for-each 遍历 HashSet
        for(Student i:hashSet){
            System.out.println(i);
        }

        System.out.println("--------------------------");
        TreeSet<Student> treeSet = new TreeSet<>();
        treeSet.add(s1);
        treeSet.add(s2);
        treeSet.add(s3);

        //迭代器
        for (Student student : treeSet) {
            System.out.print(student + "\t");
        }

    }
}
