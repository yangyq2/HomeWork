package 实验四.HashSet_TreeSet;

import java.util.TreeSet;

public class Test {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>();
        //添加元素
        treeSet.add(10);
        treeSet.add(20);
        treeSet.add(40);
        treeSet.add(31);
        System.out.println("集合：" + treeSet);
        //获取首尾元素
        System.out.println("集合的第一个元素：" + treeSet.first());
        System.out.println("集合的最后一个元素：" + treeSet.last());
        //比较并获取元素
        System.out.println("集合中小于或者等于20的元素:" + treeSet.floor(20));
        System.out.println("集合中大于30的最小的元素:" + treeSet.higher(30));
        //删除元素
        Object o = treeSet.pollFirst();//删除集合的第一个元素并返回他的值
        Object o1 = treeSet.pollLast();
        System.out.println("即将被删除的元素："+o);
        System.out.println("即将被删除的元素："+o1);
        System.out.println("删除元素后的集合："+treeSet);
    }
}
