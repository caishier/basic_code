package demo10;

import java.util.ArrayList;

/**
 * @Author caixuan
 * @Date 2020/7/26 11:11
 * @Version 1.0
 */

/*
ArrayList当中常用的方法

public boolean add(E e):向集合当中添加元素，参数类型和泛型一致
public E get(int index):从集合当中获取元素，参数是索引编号，返回值就是对应位置的元素
public E remove(int index)：从集合当中删除元素，参数是索引编号，返回值就是被删除的元素
public int size():获取集合尺寸的长度，返回值是集合中包含的元素

 */

public class DemoArrayListUse {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        System.out.println(list);

        //向集合中添加元素
        boolean sucess = list.add("caixuan");
        System.out.println(list);
        System.out.println("添加的动作是否成功"+sucess);

        list.add("张三");
        list.add("李四");
        list.add("王五");
        System.out.println(list);

        //从集合中获取元素  get.索引值从0开始
        String name  = list.get(2);
        System.out.println("第二号索引位置"+name);

        //从集合中删除元素  remove
        String whoRemove = list.remove(3);
        System.out.println("被删除的人是"+whoRemove);
        System.out.println(list);

        //获取集合的长度尺寸
        int size = list.size();
        System.out.println(size);

    }
}
