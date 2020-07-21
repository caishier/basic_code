package demo06;

/**
 * @Author caixuan
 * @Date 2020/7/21 22:21
 * @Version 1.0
 */


/*
通常情况下，一个类并不能直接使用，需要根据类创建一个对象
1、导包
import 包名.类名
对于和当前类同一个包的情况，可以省略导包语句
2、创建
类名 对象名 = new 类名称（）;
Student stu = new Student();
3、使用
    1、使用成员变量:对象名.成员变量名
    2、使用成员方法：对象名.成员方法名（参数）
    想用谁，就用对象名.谁

ps：
成员变量没有进行赋值，那么会有一个默认值

 */
public class StudentUse {
    public static void main(String[] args) {
        //导包，Student类与自己StudentUse位于同一个包下

        //2、创建
        Student stu = new Student();

        //3.使用成员变量
        System.out.println(stu.age);//0
        System.out.println(stu.name);//null

        //改变对象中成员变量的内容
        stu.name = "aa";
        stu.age = 23;

        //使用对象的成员方法

        stu.eat();
    }
}


//手机类练习