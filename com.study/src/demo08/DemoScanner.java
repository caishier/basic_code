package demo08;

import java.util.Scanner;

/**
 * @Author caixuan
 * @Date 2020/7/25 19:45
 * @Version 1.0
 */
/*
键盘输入操作

引用类型的一般使用步骤
1、导包
2、创建
3、使用

 */
public class DemoScanner {
    public static void main(String[] args) {
        //system.in 代表从键盘进行输入
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        System.out.println("输入的数字是"+num);

        String str = scanner.next();
        System.out.println("输入的字符串是"+str);

    }
}
