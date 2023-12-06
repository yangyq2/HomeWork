package 作业四.集合练习Demo.班级点名器3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        /*
        班级里面有 N 个学生
        点到的学生不会再被点到
        但是如果班级内的学生都点完了，就会进入下一次点名
        */
        ArrayList<String> list = new ArrayList<>();

        Collections.addAll(list, "奥特曼", "猪八戒", "孙悟空", "贝吉塔", "唐僧", "沙和尚", "如来佛祖",
                "白骨精", "女儿国国王", "观音菩萨", "潘金莲", "武则天");

        ArrayList<String> list1 = new ArrayList<>(list);//list里面的数据删除后，list1里面的数据也会清除

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            if (list.size() != 0) {
                int name = random.nextInt(list.size());
                System.out.println(list.get(name));
                scanner.nextLine();
                list.remove(name);

            } else {
                Collections.addAll(list1);
                System.out.println("是否继续点名y/n");
                char str = scanner.next().charAt(0);
                if (str == 'n' || str == 'N') {
                    return;
                }
            }
        }
    }
}
