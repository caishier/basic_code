package demo02;
import java.util.Arrays;

/**
 * @Author caixuan
 * @Date 2020/7/21 21:52
 * @Version 1.0
 */
/*
面向过程：当需要实现一个功能的时候，每一个具体的步骤都要亲力亲为，详细处理每一个细节

面向对象：当需要实现一个功能的时候，不关系具体的步骤，而是找一个已经具有该功能的人，来帮我做事
 */
public class DemoPrintArray {

    public static void main(String[] args) {
        int[] array = {1,0,2,5,6,8};
        //要求打印的格式为[1,0,2,5,6,8]
        //使用面向过程
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            if (i == array.length-1) {//如果是最后一个元素
                System.out.println(array[i]+"]");
            }else {//如果不是最后一个元素
                System.out.print(array[i]+",");
            }
        }
        System.out.println("============");

        //使用面向对象
        System.out.println(Arrays.toString(array));
    }
}
