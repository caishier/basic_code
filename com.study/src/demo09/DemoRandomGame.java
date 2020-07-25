package demo09;

import java.util.Random;
import java.util.Scanner;

/**
 * @Author caixuan
 * @Date 2020/7/25 23:51
 * @Version 1.0
 */
/*
猜数小游戏

思路：
1、首先要产生一个随机数字，并且一旦产生不再变化，用Random的nextInt方法
2、需要键盘输入，Scanner
3、获取键盘输入的数字，用Scanner的nextInt方法
4、已经获取到2个数字，判断if
    大了，提示，并且重试
    小了，提示，并且重试
    猜中，结束
5、重试 ，死循环


 */
public class DemoRandomGame {

    public static void main(String[] args) {
        Random r = new Random();
        int randomNum = r.nextInt(100)+1;
        Scanner sc = new Scanner(System.in);

       while (true){
           System.out.println("请输入你的数字：");
           int guessNum = sc.nextInt();
           if (guessNum>randomNum){
               System.out.println("太大了，请重试");
           }else if (guessNum<randomNum){
               System.out.println("太小了，请重试");
           }else {
               System.out.println("恭喜你，猜中啦");
               break;
           }
       }
        System.out.println("游戏结束！");
    }
}
