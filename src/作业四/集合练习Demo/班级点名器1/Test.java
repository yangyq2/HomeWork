package 作业四.集合练习Demo.班级点名器1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Test {
    public static void main(String[] args) {
        //创建集合，并在里面填入姓名
        List<String> list = new ArrayList<>();
        Collections.addAll(list,"张三","李四","王五","周润发","搏击俱乐部","楚门的世界","真探","天龙八部");

        //创建一个随机种子，让它在这个集合中随机抽取一个元素，并显示信息
        Random random = new Random();

        int index = random.nextInt(list.size());
        System.out.println(list.get(index));

        //第二种方法:使用 Collections.shuffle() 方法打乱集合里面的元素排列，获取集合的第一个元素
        Collections.shuffle(list);
        System.out.println("打乱后的第一个元素："+list.get(0));
    }
}
