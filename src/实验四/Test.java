package 实验四;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class Test {
    public static void main1(String[] args) {
        // 说明：以ArrayList 实现类来演示
        Collection col = new ArrayList();
        // add:添加单个元素
        col.add("jack");
        col.add(10); //col.add(new Integer(10))
        col.add(true);
        System.out.println("col=" + col);
        System.out.println("-----------------------");
        // remove:删除指定元素
        col.remove(0);//删除第二个元素
        System.out.println("col=" + col);//没有生效！！
        col.remove(true);//指定删除某个元素
        System.out.println("col=" + col);
        // contains:查找元素是否存在
        System.out.println(col.contains("jack"));//F
        // size:获取元素个数
        System.out.println(col.size());//1
        // isEmpty:判断是否为空
        System.out.println(col.isEmpty());//F
        // clear:清空
        col.clear();
        System.out.println("col=" + col);
        // addAll:添加多个元素
        Collection col2 = new ArrayList();
        col2.add("红楼梦");
        col2.add("三国演义");
        col.addAll(col2);
        System.out.println("col2=" + col2);
        System.out.println("col=" + col);
        // containsAll:查找多个元素是否都存在
        System.out.println(col.containsAll(col2));//T
        // removeAll：删除多个元素
        col.add("聊斋");
        col.removeAll(col2);//删除和col2中相同的元素
        System.out.println("col=" + col);//[聊斋]
    }
    public static void main(String[] args) {
        List list = new ArrayList();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        System.out.println(list);
        //在2号位插入一个元素
        list.add(1,"简简");
        System.out.println(list);
        //获得第5个元素
        System.out.println(list.get(4));
        //删除第6个元素
        list.remove(5);
        System.out.println(list);
        //修改第7个元素
        list.set(6,"简简");
        System.out.println(list);
        //迭代器遍历
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Object next = iterator.next();
            System.out.println(next);
        }
    }
}
