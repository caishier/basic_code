package demo05;

/**
 * @Author caixuan
 * @Date 2020/7/15 23:11
 * @Version 1.0
 */
/*

直接打印数组名称，得到的是数组对应的：内存地址哈希值

访问数据元素的格式：
数组名称[索引值]
索引值：就是一个int数字，代表数组当中元素的编号
ps：索引值从0开始，一直到“数组的长度-1”为止
 */

public class DemoArrayUse {
    public static void main(String[] args) {
        //静态初始化的省略格式
        int[] array = {10,20,30};
        System.out.println(array);//[I@1b6d3586

        System.out.println(array[0]);


        int num = array[1];
        System.out.println(num);

    }


}


//访问数据组元素进行获取