package demo05;

/**
 * @Author caixuan
 * @Date 2020/7/19 10:02
 * @Version 1.0
 */

/*
获取数组长度：
数组名称.length
将会得到一个int数字，代表数组长度
数组一旦创建，程序运行期间，长度不可改变


遍历数组：
遍历出数组中的最大值

 */
public class DemoArrayLength {
    public static void main(String[] args) {

        int[] array1 = {15,20,52,15,8584,54};
        //使用循环，次数就是数组的长度
        for (int i = 0; i < array1.length ; i++) {
            System.out.println(array1[i]);
        }

        getMax(array1);
        revers(array1);
    }
    //求最大值
    public static void getMax(int[] array){

        int max = array[0];//比武擂台
        for (int i = 1; i < array.length; i++) {
            //如果当前元素比max更大，则换人
            if (array[i] > max){
                max = array[i];
            }
        }

        System.out.println("最大值"+max);
    }


    public static void revers(int[] array){
        /*
        初始化语句：int min = 0，max = array.length-1
        条件判断：min<max
        步进表达式：min++，max--
        循环体：用第三个变量倒手
        */
        for (int min = 0,max = array.length-1; min < max; min++,min--) {
            int temp = array[min];
            array[min] = array[max];
            array[max] = temp;
        }
    }

}
