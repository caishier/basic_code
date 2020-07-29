package demo11;

/**
 * @Author caixuan
 * @Date 2020/7/29 21:36
 * @Version 1.0
 */

/*
public int length():获取字符串当中含有字符的个数，就是拿到字符串长度
public String cancat(String str)：将当前字符串和参数字符串拼接成为返回值新的字符串
public char charAT(int index)：获取指定索引位置的单个字符
public int indexOf(String str)：查找参数字符串在本字符串当中首次出现的索引位置
public String substring(int index)：截取参数位置一直到字符串末尾，返回新字符串
public String substring(int begin,int end):截取从begin开始，一直到end结束，中间的字符串
ps：[begin，end)  包含左边，不包含右边

public char[] toCharArray():将当前字符串拆分成为字符数组作为返回值
public byte[] getBytes():获得当前字符串底层的字节数组
public String replace(CharSequence oldString,CharSequence newString):将所有出现的老字符串替换成为新的字符串，返回替换之后的结果 新字符串

public String[] split(String regex):按照参数的规则，将字符串分割为若干部分
ps:split方法的参数其实是一个正则表达式

 */

public class DemoStringMethod {

    public static void main(String[] args) {
        String str = "aaa,bbb,ccc";
        String[] array = str.split(",");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

    }
}
