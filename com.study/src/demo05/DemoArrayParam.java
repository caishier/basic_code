package demo05;

/**
 * @Author caixuan
 * @Date 2020/7/21 21:29
 * @Version 1.0
 */
/*
数组可以作为方法的参数
当调用方法的时候，向方法小括号进行传参，传递进去的其实是数组的地址值
 */
public class DemoArrayParam {
    public static void main(String[] args) {
        int[] array = {10,20,30,40,50};

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        System.out.println("aaa");


        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        System.out.println("bbb");

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        System.out.println("ccc");

        //调用方法
        printArray(array);//地址值

    }
         /*
        三要素
        返回值类型：只是进行打印，没有返回值
        方法名称：printArray
        参数列表：数组
         */
        public static void printArray(int[] array){
            System.out.println("printArray接收到是是地址值"+array);
            for (int i = 0; i < array.length ; i++) {
                System.out.println(array[i]);
            }
        }

}
