package 作业四.集合练习Demo.斗地主;
import java.util.ArrayList;
import java.util.Collections;

public class PokerGame {

    static ArrayList<String> hands = new ArrayList<>();

    static {
        /*
        手牌花色：黑桃："♠" 红桃："♥" 梅花："♣" 方片："♦"
        "1","2","3","4","5","6","7","8","9","10","J","Q","K"
         */
        //创建手牌
        String[] color = {"♠" ,"♥" ,"♣" ,"♦"};
        String[] number = {"1","2","3","4","5","6","7","8","9","10","J","Q","K"};

        for (String s : color) {
            for (String num : number) {
                hands.add(s + num);
            }
        }
        hands.add("大王");
        hands.add("小王");
    }
    public PokerGame(){
        //洗牌
        Collections.shuffle(hands);
        //发牌  预留三张牌作为地主的底牌
        ArrayList<String> lord = new ArrayList<>();
        ArrayList<String> player1 = new ArrayList<>();
        ArrayList<String> player2 = new ArrayList<>();
        ArrayList<String> player3 = new ArrayList<>();

        for (int i = 0; i < hands.size(); i++) {
            //将牌放在一个字符串里面
            String poker = hands.get(i);
            if (i<=2){
                lord.add(poker);
                continue;
            }
            if (i%3==0){
                player1.add(poker);
            }else if(i%3 == 1){
                player2.add(poker);
            }else{
                player3.add(poker);
            }
        }
        //显示手牌信息
        lookPoker("玩家1：",player1);
        lookPoker("玩家2：",player2);
        lookPoker("玩家3：",player3);
        lookPoker("底牌：",lord);

    }
    void lookPoker(String name,ArrayList<String> list){
        System.out.print(name+"手牌:");
        for (String s : list) {
            System.out.print(s+" ");
        }
        System.out.println();
    }
}
