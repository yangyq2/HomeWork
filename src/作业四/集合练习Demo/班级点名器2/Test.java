package 作业四.集合练习Demo.班级点名器2;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Test {
    public static void main(String[] args) {
        /*
          班级里面有 N 个学生
          70%的概率抽到男生
          30%的概率抽到女生
         */
        //1.创建一个集合，添加七个 1 和三个 0，如果随机出来的是1就去男生的集合里面随机选一名，如果是0就去女生的列表里面选

        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list,1,1,1,1,1,1,1,0,0,0);
        //打乱集合
        Collections.shuffle(list);
        System.out.println(list.get(0));
        //根据随机出来的数字选择男生或者女生
        ArrayList<String> boyList = new ArrayList<>();
        ArrayList<String> girlList = new ArrayList<>();

        Collections.addAll(boyList,"奥特曼","猪八戒","孙悟空","贝吉塔","唐僧","沙和尚","如来佛祖");
        Collections.addAll(girlList,"白骨精","女儿国国王","观音菩萨","潘金莲","武则天");

        if (list.get(0)==1){
            Random random = new Random();
            int name = random.nextInt(boyList.size());
            System.out.println(boyList.get(name));
        }else {
            Random random = new Random();
            int name = random.nextInt(girlList.size());
            System.out.println(girlList.get(name));
        }
    }
}
