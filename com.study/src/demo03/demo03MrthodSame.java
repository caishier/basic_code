package demo03;

/**
 * @Author caixuan
 * @Date 2020/7/14 21:55
 * @Version 1.0
 */

/*
题目要求：定义一个方法，用来判断两个数据是否相同
 */
public class demo03MrthodSame {
    public static void main(String[] args) {
        System.out.println(isSame(20,20));

    }

    public static boolean isSame(int a, int b) {
        /*
//        三要素
//        返回值类型：boolean
//        方法名称：isSame
//        参数列表：int a，int b
//                 */
//        boolean same;
//        if (a == b) {
//            same = true;
//        } else {
//            same = false;
//        }
//        return same;

//          boolean same = a == b?true:false;
//          return same;

            return a==b;
    }

}