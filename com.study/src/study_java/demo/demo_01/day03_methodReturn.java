package study_java.demo.demo_01;

/**
 * @Author caixuan
 * @Date 2020/7/13 22:21
 * @Version 1.0
 */

/*
题目要求：定义一个方法，用来求出两个数字之和(有返回值)
题目变形：定义一个方法，用来打印两个数之和(没返回值)
注意事项：
    对于有返回值的方法，可以使用单独调用、打印调用或者赋值调用
    对于无返回值的方法，只能单独调用

 */
public class day03_methodReturn {
    public static void main(String[] args) {
        //我是main方法，我来调用你
        //我调用你，你来帮我计算一下，算完后，把结果告诉我的num变量
        int num = getSun(20,20);
        System.out.println("返回值是"+num);
        System.out.println("=====================");
        printSum(50,80);
        System.out.println("====================");
        System.out.println(getSun(2,5));//打印调用
        getSun(10,33);//赋值调用，但是返回值没有用到
        System.out.println("==============");

    }

    //我是一个方法，我负责两个数字相加
    //我有返回值int，谁调用我，我就把计算结果告诉他
    public static int getSun(int a,int b){
        int result = a+b;
        return result;
    }

    //我是一个方法，我负责两个数相加
    //我没有返回值，不会把结果告诉任何人，而是我自己进行打印
    public static void printSum(int a,int b){
        int result = a + b;
        System.out.println("结果是"+result);
    }

}


//下次学习1_1_12_14