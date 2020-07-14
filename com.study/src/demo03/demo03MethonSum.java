package demo03;

/**
 * @Author caixuan
 * @Date 2020/7/14 22:09
 * @Version 1.0
 */

/*
题目：定义一个方法，用来求出1-100之间所有的数字之和
 */
public class demo03MethonSum {
    public static void main(String[] args) {
        System.out.println("结果是"+getSum());//打印调用
    }
    /*/
    三要素
    返回值：有返回值，计算结果int
    方法名称：getSum
    参数列表：数据范围已经确定，是固定的，不需要参数
     */
    public static int getSum(){
        int sum = 0;
        for (int i = 1; i < 100; i++) {
            sum+=i;
        }
        return sum;
    }

}
