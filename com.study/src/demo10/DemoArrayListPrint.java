package demo10;

import java.sql.SQLOutput;
import java.util.ArrayList;

/**
 * @Author caixuan
 * @Date 2020/7/27 20:48
 * @Version 1.0
 */
/*
题目：定义以指定格式打印集合的方法（ArrayList类型作为参数），使用{}括起来，使用@分隔每个元素
格式参照{元素@元素@元素}
System.out.println(list) [10,20,30]
printArrayList(lisy)  {10@20@30}
 */
public class DemoArrayListPrint {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("张三丰");
        list.add("张翠山");
        list.add("宋远桥");
        list.add("张无忌");
        printArrayList(list);
    }

    /*
    定义方法：
    返回值类型：只是打印而已，没有运算，没有结果，用void
    方法名称
    参数类表
     */
    public static void printArrayList(ArrayList<String> list){
        System.out.print("{");
        for (int i = 0; i < list.size(); i++) {
            String name = list.get(i);
            if (i == list.size()-1){
                System.out.print(name+"}");
            }else {
                System.out.print(name+"@");
            }
        }
    }
}
