package 实验三.Java常用类库;

/*
2.掌握String、StringBuffer、System、RunTime、
Math、Random、Date、Calendar、DateFormat使用方法。
*/
public class Test {
    public static void main(String[] args) {

        /*
        String是不可变的，而StringBuffer是可变的。这意味着一旦创建了一个String对象，就不能对其进行修改。而StringBuffer允许我们对字符串进行修改，例如添加、删除或替换字符等操作。

        由于String是不可变的，所以在多线程环境下使用String可能会导致性能问题。而StringBuffer在多线程环境下可以提供更好的性能，因为它是线程安全的。

        StringBuffer提供了更多的方法来操作字符串，例如append()、insert()、delete()等。这些方法比直接对String进行操作更加方便和高效。

        当需要频繁修改字符串时，建议使用StringBuffer而不是String，因为StringBuffer的性能更好。
        */
        String str = "hello";
        String str1 = str+",world!";//使用String 定义的字符串在进行拼接的时候会重新创建一个新的字符串
        System.out.println(str1);

        StringBuffer str3 = new StringBuffer("hello");
        str3.append(",world!");//使用StringBuffer定义的字符串是可变的，在进行拼接的时候不会重新创建一个新的字符串
        System.out.println(str3);

//        int a =10;
//        Integer num = Integer.valueOf(a);//装箱
//        int value = num.intValue();//拆箱
    }
}
