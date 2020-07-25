package demo08;

import java.util.Scanner;

/**
 * @Author caixuan
 * @Date 2020/7/25 23:10
 * @Version 1.0
 */
/*
匿名对象
创建对象的标准格式
类名称 对象名 = new  类名称();

匿名对象就是只有右边的对象，没有左边的名字和赋值运算符
new 类名称();

ps:匿名对象只能使用唯一的一次，下次再次使用需要再次创建一个新对象
使用建议：如果确定有一个对象只需要使用唯一的一次，就可以使用匿名对象
 */
public class DemoAnonymous {
    public static void main(String[] args) {
//        //匿名对象
//        new Person().name = "赵又廷";
//        new Person().showName();
//
//        //匿名对象的方式
//        int num = new Scanner(System.in).nextInt();
//        System.out.println("输入的是"+num);
//
//        //使用一般写法传入参数
//        Scanner sc = new Scanner(System.in);
//        methodParam(sc);

        //使用匿名对象进行传参
        methodParam(new Scanner(System.in));


        Scanner sc = methodRetrun();
        int num = sc.nextInt();
        System.out.println("输入的是"+num);
    }

    public static void methodParam(Scanner sc){
        int num = sc.nextInt();
        System.out.println("输入的是"+num);
    }

    public static Scanner methodRetrun(){
        return new Scanner(System.in);
    }
}
