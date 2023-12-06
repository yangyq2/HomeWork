package 实验四.ArrayList_LinkedList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        /*
        1. 创建一个ArrayList集合 list，向集合中添加数据，获取集合中元素的个数并打印出第三个元素。
        2. 创建LinkedList集合link,并向link添加四个元素。向link集合的第一个位置插入元素，移除该集合中第三个元素。
        3. 分别使用Iterator 和 foreach方式遍历以上两个集合对象。
         */

        ArrayList<String> list = new ArrayList<>();
        list.add("hello");
        list.add("world!");
        list.add("Baidu");
        list.add("Tencent");
        //System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.get(2));

        Iterator<String> iterator = list.iterator();
        while(iterator.hasNext()){
            System.out.print(iterator.next()+' ');
        }
        System.out.println();
        for(String i :list){
            System.out.print(i+' ');
        }
        System.out.println("\n---------------------------------");

        LinkedList<Integer> list1 = new LinkedList<>();
        list1.add(10);
        list1.add(11);
        list1.add(12);
        list1.add(13);

        Iterator<Integer> iterator1 = list1.iterator();
        while(iterator1.hasNext()){
            System.out.print(iterator1.next()+" ");
        }
        System.out.println();
        list1.add(0,14);//在第一位插入数据 14
        list1.remove(2);//移除集合中的第三个元素
        for(int i : list1){
            System.out.print(i+" ");
        }

    }
}
