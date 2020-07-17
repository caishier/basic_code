package demo05;

/**
 * @Author caixuan
 * @Date 2020/7/17 22:24
 * @Version 1.0
 */
/*
使用动态初始化数组的时候，其中元素将会自动拥有一个默认值，规格如下：
如果是整数类型：默认为0
如果是浮点型：默认为0.0
如果是字符类型：默认为‘\u0000’
如果是布尔类型：默认为false
如果是引用类型：默认为null
ps:
静态初始化也有默认值，只不过系统自动马上将默认值替换成为了大括号当中具体数值
 */

public class DemoArrayUse01 {
    public static void main(String[] args) {
        //动态初始化一个数组
        int[] array = new int[3];
        System.out.println(array);//内存地址值
        System.out.println(array[0]);//0
        System.out.println("==============");
        //将数据123赋值给数组array当中的1号元素
        array[1] = 123;
        System.out.println(array[1]);//123
    }
}
