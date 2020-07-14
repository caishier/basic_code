package demo03;

/**
 * @Author caixuan
 * @Date 2020/7/14 22:21
 * @Version 1.0
 */
/*
使用方法的注意事项：
1、方法应该在定义在类中，但是不能再方法当中在定义方法，不能嵌套
2、方法定义的前后顺序无所谓
3、方法定义之后不会执行，如果希望执行，一定要调用：打印调用、单独调用、赋值调用
4、如果方法有返回值，那么必须写上“retrue 返回值”，不能没有
5、retrue后面的返回值数据，必须和方法的返回值类型对应起来
6、对于一个void没有返回值的方法，不能写reture后面没有返回值，只能写retrue自己
7、对于方法当中最后一行的reture可以省略不写
8、一个方法东站可以有多个reture语句，但是必须保证同时只有一个会被执行
 */

public class demo03MethodNotice {
    public static int method1() {
        return 10;
    }

    public static void method2() {
        return;
    }

    public static void method3() {
        System.out.println("aaa");
        return;//最后一行的reture可以不写
    }

    public static int getMax(int a, int b) {
//        int max;
//        if (a > b) {
//            max = a;
//        }else {
//            max = b;
//        }
//        return max;
        if (a > b) {
            return a;
        } else {
            return b;
        }

    }
}
//下次 方法重载的基本使用