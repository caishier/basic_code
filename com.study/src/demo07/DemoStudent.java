package demo07;

/**
 * @Author caixuan
 * @Date 2020/7/25 19:30
 * @Version 1.0
 */
public class DemoStudent {

    public static void main(String[] args) {
        Student stu = new Student();
        stu.setName("caixuan");
        stu.setAge(25);
        System.out.println("姓名："+stu.getName()+"，年龄"+stu.getAge());


        Student stu1 = new Student("caixuan1",27);
        System.out.println("姓名："+stu1.getName()+"，年龄"+stu1.getAge());
        stu1.setAge(28);
        System.out.println("姓名："+stu1.getName()+"，年龄"+stu1.getAge());
    }
}
