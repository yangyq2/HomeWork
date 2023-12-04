package 实验三.String_StringBuffer;

import java.util.Scanner;


/*
从键盘输入一段英文（或从TXT文档中读取）；
统计该英文的长度、单词数，按26个英文字母（不区分大小写）统计在该段文字中出现的频率；
把其中每个单词的第一个字母转换为大写，而单词中的其余字母小写；
将该段英文做简单的倒序替换加密处理（例如a替换为z，b替换为y，c替换为x，以此类推）；
 */
public class Test {
    public static void main(String[] args) {
        //1.通过键盘输入的方式获取一段英文
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一段英文：");
        String input = scanner.nextLine();

        // 统计长度和单词数
        int length = input.length();
        String[] words = input.split("\\s+");
        int wordCount = words.length;

        // 统计字母频率
        //toLowerCase() 将大写的字母转化为小写
        //将字符串转化为字符数组
        int[] letterFrequency = new int[26];
        for (char c : input.toLowerCase().toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                letterFrequency[c - 'a']++;//字符在 a-z 之间，就将它的下标对应的值加 1
            }
        }

        // 转换单词首字母大写
        StringBuilder capitalizedWords = new StringBuilder();
        for (String word : words) {
            capitalizedWords.append(Character.toUpperCase(word.charAt(0)))
                    .append(word.substring(1).toLowerCase()).append(" ");
        }
        String capitalizedInput = capitalizedWords.toString();

        // 倒序替换加密处理
        StringBuilder encryptedInput = new StringBuilder();
        for (char c : capitalizedInput.toCharArray()) {
            if (c >= 'A' && c <= 'Z') {
                encryptedInput.append((char) ('Z' - (c - 'A')));
            } else if(c>='a'&&c<='z') {
                encryptedInput.append((char)('z'-(c-'a')));
            }else{
                encryptedInput.append(c);
            }
        }

        // 输出结果
        System.out.println("输入的英文长度为：" + length);
        System.out.println("输入的英文单词数为：" + wordCount);
        System.out.println("字母频率统计结果：");
        for (int i = 0; i < 26; i++) {
            System.out.print((char) (i + 'a') + ":" + letterFrequency[i]+" ");
        }
        System.out.println("\n首字母大写的英文为：" + capitalizedInput);
        System.out.println("倒序替换加密处理后的英文为：" + encryptedInput);
    }
}
