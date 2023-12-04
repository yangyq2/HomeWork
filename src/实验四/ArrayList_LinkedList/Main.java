package 实验四.ArrayList_LinkedList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        /*
        1. 创建一个ArrayList集合alist，向集合中添加数据，获取集合中元素的个数并打印出第三个元素。
        2. 创建LinkedList集合link,并向link添加四个元素。向link集合的第一个位置插入元素，移除该集合中第三个元素。
        3. 分别使用Iterator 和foreach方式遍历以上两个集合对象。
         */

        ArrayList<String> alist = new ArrayList<String>();
        alist.add("hello");
        alist.add("world!");
        alist.add("Baidu");
        alist.add("Tencent");
        //System.out.println(alist);
        System.out.println(alist.size());
        System.out.println(alist.get(2));

        Iterator<String> iterator = alist.iterator();
        while(iterator.hasNext()){
            System.out.print(iterator.next()+' ');
        }
        System.out.println();
        for(String i :alist){
            System.out.print(i+' ');
        }
        System.out.println("\n---------------------------------");

        LinkedList<Integer> list = new LinkedList<Integer>();
        list.add(10);
        list.add(11);
        list.add(12);
        list.add(13);

        Iterator<Integer> iterator1 = list.iterator();
        while(iterator1.hasNext()){
            System.out.print(iterator1.next()+" ");
        }
        System.out.println();
        list.add(0,14);//在第一位插入数据 14
        list.remove(2);//移除集合中的第三个元素
        for(int i : list){
            System.out.print(i+" ");
        }

    }
}
