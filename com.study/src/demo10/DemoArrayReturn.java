package demo10;

import java.util.ArrayList;
import java.util.Random;

/**
 * @Author caixuan
 * @Date 2020/7/27 20:57
 * @Version 1.0
 */
/*
题目：
用一个大集合存入20个随机数字，然后筛选其中的偶数元素，放到小集合
使用自定义方法实现

分析
1、需要创建一个集合，用来存储int数字<Interger>
2、随机数字就用Random nextInt
3、循环20次，把随机数字放入大集合：for  add
4、定义一个方法，进行筛选
5、判断if 是偶数  num%2==0
6、如果是偶数，放到小集合
三要素
返回值类型：ArrayList小集合（元素不确定）
方法名称：getSamllList
参数类表：ArrayList大集合（装20个随机数）
 */
public class DemoArrayReturn {

    public static void main(String[] args) {
        ArrayList<Integer> biglist = new ArrayList<>();
        Random r = new Random();
        for (int i = 0; i < 20; i++) {
            int num = r.nextInt(100)+1;
            biglist.add(num);
        }
        ArrayList<Integer> smallList = getSamllList(biglist);
        System.out.println("偶数个数为"+smallList.size());
        for (int i = 0; i < smallList.size(); i++) {
            System.out.println(smallList.get(i));
        }
    }
    
    //接收大集合，返回小集合结果
    public static ArrayList<Integer> getSamllList(ArrayList<Integer> bigList){
        //创建一个小集合，用来装偶数
        ArrayList<Integer> smallList = new ArrayList<>();
        for (int i = 0; i < bigList.size(); i++) {
            int num = bigList.get(i);
            if (num%2==0){
                smallList.add(num);
            }
        }
        return smallList;
    } 
}
