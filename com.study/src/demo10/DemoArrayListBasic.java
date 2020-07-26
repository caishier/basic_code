package demo10;

import java.util.ArrayList;

/**
 * @Author caixuan
 * @Date 2020/7/26 11:24
 * @Version 1.0
 */
/*
如果希望向集合ArrayList当中存储基本类型数据，必须使用基本类型对应的包装类

基本类型  包装类（引用类型，位于java.lang）
byte        Byte
short       Short
int         Integer
long        Long
float       Float
double      Double
char        Character
boolean     Boolean


从JDK 1.5+ ,支持自动装箱、自动拆箱
 */
public class DemoArrayListBasic {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        ArrayList<Integer> listC = new ArrayList<>();
        listC.add(100);
        listC.add(123);
        listC.add(123213);
        System.out.println(listC);

        int num = listC.get(2);
        System.out.println(num
        );


    }
}
