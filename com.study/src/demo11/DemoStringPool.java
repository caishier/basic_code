package demo11;

/**
 * @Author caixuan
 * @Date 2020/7/29 21:01
 * @Version 1.0
 */

/*
字符串常量池：程序当中直接写上双引号字符串，就在字符串常量池当中
对于基本类型来说，==是进行数值比较
对于引用类型来说，==是进行 地址值的比较

 */
public class DemoStringPool {

    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "abc";

        char[] charArray = {'a','b','c'};
        String str3 = new String(charArray);
        System.out.println(str1==str2);
        System.out.println(str1==str3);
        System.out.println(str2==str3);

    }
}
