package demo10;

import java.util.ArrayList;

/**
 * @Author caixuan
 * @Date 2020/7/26 11:21
 * @Version 1.0
 */
public class DemoArrayListEach {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("张三");
        list.add("李四");
        list.add("王五");

        //遍历集合   list.fori  简易写法
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

}
