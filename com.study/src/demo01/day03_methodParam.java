package demo01;

/**
 * @Author caixuan
 * @Date 2020/7/13 22:15
 * @Version 1.0
 */
/*
有参数：小括号当中有内容，当一个方法需要一些数据条件，才能完成任务是，就是有参数
无参数：小括号当中留空，一个方法不需要任何数据条件，自己能独立完成任务，就是无参数
* */
public class day03_methodParam {

    public static void main(String[] args) {
        method1(10,20);
        method2();
    }
    //两个数字相乘，做乘法
    private static void method1(int a,int b){
        int result = a*b;
        System.out.println("结果是"+result);
    }

    //例如打印输出固定10次文本字符串
    public static void method2(){
        for (int i = 0; i < 10; i++) {
            System.out.println("hello world"+i);
        }
    }
}
