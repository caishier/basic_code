package demo11;

/**
 * @Author caixuan
 * @Date 2020/7/27 21:21
 * @Version 1.0
 */
/*
创建字符串的常见3+1种方式
三种构造方法
public String():创建一个空白字符串，不含任何内容
public String(char[] array):根据字符数组的内容，来创建对应的字符串
public String(byte[] array)：根据字节数组的内容，来创建对应的字符串
直接创建

 */
public class DemoString {

    public static void main(String[] args) {
        //使用空参来构造
        String str1 = new String();//
        System.out.println("第一个字符串"+str1);
        //根据字符数组创建
        char[] charArray = {'A','B','C'};
        String str2 = new String(charArray);
        System.out.println("第一个字符串"+str2);
        //根据字节数组创建
        byte[] byteArray = {97,98,99};
        String str3 = new String(byteArray);
        System.out.println("第一个字符串"+str3);
    }
}
