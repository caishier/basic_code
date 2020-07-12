package study_java.demo.demo_01;
//使用三元运算符和标准的if-else语句分别实现：取两个数当做的最大值
public class day_20200712 {
    public static void main(String[] args) {
        int a = 105;
        int b = 80;
/*      1、三元运算符
        int max = a>b?a:b;
 */
//        if-else
        int max;
        if (a>b){
            max = a;
        }else {
            max = b;
        }
    }
}
