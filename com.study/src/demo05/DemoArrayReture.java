package demo05;

/**
 * @Author caixuan
 * @Date 2020/7/21 21:39
 * @Version 1.0
 */
/*
一个方法可以有0、1多个参数，但是只能有0或1个返回值，不能有多个返回值

任何数据类型都能作为方法的参数类型，或者返回值
数组作为方法的参数，传递进去的是数组的地址值
数组作为方法的返回值，返回的是数组的地址值


 */
public class DemoArrayReture {
    public static void main(String[] args) {
        int[] result = calculate(10,20,30);
        System.out.println("main方法接收到的返回值数组是"+result);
        System.out.println("和"+result[0]);
        System.out.println("平均数"+result[1]);
    }

    public static int[] calculate(int a,int b,int c){
        int sum = a+b+c;
        int avg = sum/3;
//        int[] array = new int[2];
//        array[0] = sum;
//        array[1] = avg;
        int[] array = {sum,avg};
        System.out.println("calculate方法内部返回值数组是"+array);
        return array;
    }
}
