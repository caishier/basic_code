package demo04;

/**
 * @Author caixuan
 * @Date 2020/7/15 22:07
 * @Version 1.0
 */
/*
方法的重载（overload）:多个方法的名称一样，参数的列表不同
好处：只需要记住唯一一个方法名称，就可以实现类似的多个功能

方法重载与下列因素相关：
1、参数个数不同
2、参数类型不同
3、参数的多类型不同

方法重载与下列因素无关
1、与参数的名称无关
2、与参数的返回值类型无关
3、
 */
public class DemoMethodOverload {
    public static void main(String[] args) {
        System.out.println(sum(110,10,30,40));

    }
    public static int sum(int a,int b){//2个参数
        return a+b;
    }
//      与返回值类型无关
//    public static double sum(int a,int b){//2个参数
//        return a+b;
//    }
    //      与参数名称无关
//    public static int sum(int x,int b){//2个参数
//        return x+y;
//    }

    public static int sum(int a,int b,int c){
        return a+b+c;
    }

    public static int sum(int a,int b,int c,int d){
        return a+b+c+d;
    }

    public static int sum(double a,double b){
        return (int)(a+b);
    }

    public static int sum(int a,double b){
        return (int)(a+b);
    }

}
