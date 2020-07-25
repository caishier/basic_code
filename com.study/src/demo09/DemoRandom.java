package demo09;

import java.util.Random;

/**
 * @Author caixuan
 * @Date 2020/7/25 23:27
 * @Version 1.0
 */
/*

Random类用来生成随机数据

 */
public class DemoRandom {
    public static void main(String[] args) {
        Random random = new Random();
        int num = random.nextInt();
        System.out.println("随机数"+num);
        System.out.println("==========================");


        for (int i = 0; i < 100; i++) {
            int num1 = random.nextInt(10);//范围：左闭右开0~9
            System.out.println(num1);
        }

    }


}
