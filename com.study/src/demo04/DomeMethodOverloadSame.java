package demo04;

/**
 * @Author caixuan
 * @Date 2020/7/15 22:25
 * @Version 1.0
 */
/*
println  重载了各种类型的方法
 */


/*
题目：比较两个数据是否相等
参数类型分别为byte类型，两个short类型，两个int类型，两个long类型
并在main方法中进行测试
 */
public class DomeMethodOverloadSame {
    public static void main(String[] args) {
        byte a = 10;
        byte b = 20;
        System.out.println(isSame(a,b));
        System.out.println(isSame((short) 20,(short) 20));
        System.out.println(isSame(201,20));
        System.out.println(isSame(55L,55L));
    }

    public static boolean isSame(byte a,byte b){
        System.out.println("两个byte参数的方法执行！");
        boolean same;
        if (a==b){
            same = true;
        }else {
            same = false;
        }
        return same;
    }

    public static boolean isSame(int a,int b){
        System.out.println("两个int参数的方法执行！");
        boolean same = a==b?true:false;
        return same;
    }

    public static boolean isSame(short a,short b){
        System.out.println("两个short参数的方法执行！");
        boolean same = a==b?true:false;
        return same;
    }

    public static boolean isSame(long a,long b){
        System.out.println("两个long参数的方法执行！");
        boolean same = a==b?true:false;
        return same;
    }

}
