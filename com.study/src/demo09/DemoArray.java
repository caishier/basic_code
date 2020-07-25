package demo09;

/**
 * @Author caixuan
 * @Date 2020/7/26 0:53
 * @Version 1.0
 */
/*
定义一个数组，存放3个Person对象
 */
public class DemoArray {
    public static void main(String[] args) {
        //首先创建一个长度为3的数组，里面来存放Person类型的对象
        Person[] array = new Person[3];

        Person one = new Person("张三",15);
        Person two = new Person("李四",15);
        Person three = new Person("王五",15);


        //将one当中的地址值赋值到数组的0号元素位置
        array[0] = one;
        array[0] = two;
        array[0] = three;
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);


        System.out.println(array[1].getName());

    }

}



//arrayList集合