package 实验三.Date_Calender_DateFormat;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;

public class Test {
    public static void main(String[] args) {
        /*
        获取当前日期和时间并输出
        分别提取年、月、日、时、分、秒的数值
        使用DataFormat格式化日期和时间
         */
        Date date = new Date();
        System.out.println(date);

        DateFormat dateFormat = DateFormat.getDateInstance();//返回一个 DateFormat 实例
        String dateFormatDate = dateFormat.format(date);//调用 dateFormat 里面的 format 方法  将一个 Date 格式化为日期/时间字符串。
        System.out.println(dateFormatDate);


        //获取表示当前时间的 Calendar 对象
        Calendar calendar = Calendar.getInstance();
        int year = calendar.getWeekYear();
        int month = calendar.get(Calendar.MONTH);
        int day = calendar.get(Calendar.DATE);//获取当前日
        int hour = calendar.get(Calendar.HOUR);
        int minute = calendar.get(Calendar.MINUTE);
        int second = calendar.get(Calendar.SECOND);
        System.out.println(year+"年"+month+"月"+day+"日"+hour+"时"+minute+"分"+second+"秒");
        //calendar.add(Calendar.DATE,100);//在当前时间的基础上加上一百天

    }
}
