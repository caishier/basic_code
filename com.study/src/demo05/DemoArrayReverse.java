package demo05;

/**
 * @Author caixuan
 * @Date 2020/7/21 21:07
 * @Version 1.0
 */
/*

数组元素反转：

要求：不能使用新数组
1、数组元素的反转其实就是对称位置的交换
    通常遍历数组用的是一个索引
    int i = 0;
    现在标示对称位置需要两个索引
    int min = 0
    int max = array.length-1
 */
public class DemoArrayReverse {

    public static void main(String[] args) {
        int [] array = {10,50,05,15,25,80};

        //遍历打印数组本来的样子
        for (int i = 0; i < array.length ; i++) {
            System.out.println(array[i]);
        }
        System.out.println("==============");
        /*
        初始化语句： int min = 0，max = array.length-1
        条件判断：min<max
        步进表达式：min++,max--
        循环体：用第三个变量倒手
         */

        for (int min = 0,max = array.length-1;min<max; min++,max--) {
            int temp = array[min];
            array[min] = array[max];
            array[max] = temp;
        }
        //再次打印遍历输出
        for (int i = 0; i < array.length ; i++) {
            System.out.println(array[i]);
        }
    }


}
