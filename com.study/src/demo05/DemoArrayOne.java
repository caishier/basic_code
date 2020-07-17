package demo05;

/**
 * @Author caixuan
 * @Date 2020/7/17 22:45
 * @Version 1.0
 */
public class DemoArrayOne {
    public static void main(String[] args) {
        int[] array = new int[3];//动态初始化
        System.out.println(array);//地址值
        System.out.println(array[0]);//0
        System.out.println(array[1]);//0
        System.out.println(array[2]);//0

        System.out.println("===============");
        array[1] = 10;
        array[2] = 20;
        System.out.println(array);//0
        System.out.println(array[1]);//10
        System.out.println(array[2]);//20

    }
}



// 常见问题 数组索引越界异常
