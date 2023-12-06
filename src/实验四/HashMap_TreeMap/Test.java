package 实验四.HashMap_TreeMap;

import java.lang.reflect.Array;
import java.util.*;

public class Test {
    public static void main(String[] args) {
        Student s1 = new Student("小明", 10, 190);
        Student s2 = new Student("小红", 13, 101);
        Student s3 = new Student("小蓝", 14, 232);

        //同姓名和同年龄的学生他们存入 hashmap 并重写 hashcode、equals方法后，会认为是同一个对象
        Student s4 = new Student("小绿", 14, 132);
        Student s5 = new Student("小绿", 14, 132);

        HashMap<Student,String> hm = new HashMap<>();
        hm.put(s1,"河南");
        hm.put(s2,"湖北");
        hm.put(s3,"安徽");
        hm.put(s4,"北京");
        hm.put(s5,"山东");

        for(Student s: hm.keySet()){
            System.out.println("学生信息："+s+"\t籍贯："+hm.get(s));
        }
        //System.out.println(hm);
        HashMap<ArrayList<String>,String> hm1 = new HashMap<>();
        ArrayList<String> arr = new ArrayList<>();
        arr.add("河南");
        arr.add("湖北");
        arr.add("安徽");
        arr.add("北京");
        hm1.put(arr,"省份");

        Set<Map.Entry<ArrayList<String>, String>> entries = hm1.entrySet();
        for (Map.Entry<ArrayList<String>, String> entry : entries) {
            //StringJoiner 每个 Map.Entry 对象都有一个键（key）和一个值（value）。
            // 通过实现 Map.Entry 接口的类可以自定义键值对的存储方式。
            StringJoiner stringJoiner = new StringJoiner("-",""," ");
            for (String s : entry.getKey()) {
                stringJoiner.add(s);
            }
            String value = entry.getValue();

            System.out.println(value+":"+stringJoiner);
        }
    }
}
