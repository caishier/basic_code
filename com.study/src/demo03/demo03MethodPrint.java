package demo03;

/**
 * @Author caixuan
 * @Date 2020/7/14 22:13
 * @Version 1.0
 */
/*
题目：定义一个方法，打印指定次数的hello world
 */
public class demo03MethodPrint {
    public static void main(String[] args) {
        printCount(5);
    }

    /*
    三要素
    返回值类型：只是进行打印操作，没有计算没有返回值
    方法名称：printCount
    参数列表：没有固定的次数，次数：int
     */
    public static void printCount(int num){
        for (int i = 0; i < num; i++) {
            System.out.println("hello world"+(i+1));
        }
    }
}
