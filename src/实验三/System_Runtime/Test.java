package 实验三.System_Runtime;

import java.io.IOException;
import java.util.Date;


public class Test {
    public static void main(String[] args) throws IOException {
        // 获取当前系统的全部属性
        //System.getProperties().list(System.out);

        // 获取操作系统的版本号
        String osVersion = System.getProperty("os.version");
        System.out.println("操作系统版本号： " + osVersion);

        long startTime = System.currentTimeMillis();//获取当前时间
        StringBuilder str= new StringBuilder();
        for (int i = 0; i < 1000000; i++) {
            str.append(i);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("StringBuffer的用时："+(endTime-startTime));

        long startTime1 = System.currentTimeMillis();//获取当前时间
        String str1 = null;
        for (int i = 0; i < 10000; i++) {
            str1 += i;
        }
        long endTime1 = System.currentTimeMillis();
        System.out.println("String的用时："+(endTime1-startTime1));
        Date date = new Date();
        System.out.println(date);

        try{
            Process process = Runtime.getRuntime().exec("notepad.exe");
            Thread.sleep(2000);
            process.destroy();
        }catch (IOException | InterruptedException e){
            e.printStackTrace();
        }

        Runtime runtime = Runtime.getRuntime();
        int CpuNumber = runtime.availableProcessors();//返回
        // 可用CPU的个数
        System.out.println("现在可用的CPU的个数为：" + CpuNumber);
        System.out.println("最大内存容量："+runtime.maxMemory());
        System.out.println("总内存容量："+runtime.totalMemory());
        System.out.println("可用内存容量："+runtime.freeMemory());
    }
}
