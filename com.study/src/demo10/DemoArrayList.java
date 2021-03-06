package demo10;

import java.util.ArrayList;

/**
 * @Author caixuan
 * @Date 2020/7/26 10:54
 * @Version 1.0
 */
/*
数组的长度不可以发生改变
但是ArrayList集合长度是可以随意改变的

对于ArrayList来说，有一个尖括号<E>代表泛型
泛型：就是装在集合当中所有元素，全都是统一的类型
ps：泛型只能是引用类型，不能是基本类型

注意事项：
对于ArrayList集合来说，直接打印得到的不是地址值，而是内容
如果内容是空，得到的是空的中括号[]
 */
public class DemoArrayList {
    public static void main(String[] args) {
        //创建了一个ArrayList集合，集合的名称是list，里面装的全部是String字符串类型数据
        //从JDK1.7+开始，右侧的尖括号内部可以不写内容，但是<>本身还是要写的
        ArrayList<String> list = new ArrayList<>();
        System.out.println(list);//[]

        //向集合当中添加一些数据，add方法
        list.add("caixuan");
        System.out.println(list);


    }
}
