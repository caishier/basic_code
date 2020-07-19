package demo05;

/**
 * @Author caixuan
 * @Date 2020/7/19 9:53
 * @Version 1.0
 */
/*
所有引用类型变量，都可以赋值为null，但是代表其中什么都没有
数组必须进行new初始化才能使用其中元素
如果只是赋值一个null值，没有进行new创建
会报空指针异常
 */
public class DemoArrayIndex {
    public static void main(String[] args) {
        int [] array = null;
        System.out.println(array);
    }
}
