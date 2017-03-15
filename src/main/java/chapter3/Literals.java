package chapter3;

import org.junit.Test;

/**
 * 直接常量
 * <br>Created by 吴海南 on 2017/3/8.
 * <br>星期三 at 9:41.
 */
public class Literals {
    @Test
    public void literals(){
        int i1=0x2f;//小写字母
        System.out.println("i1:"+Integer.toBinaryString(i1));
        int i2=0X2F;//大写字母
        System.out.println("i2:"+Integer.toBinaryString(i2));
        int i3=0177;//Octal八进制
        System.out.println("i3:"+Integer.toBinaryString(i3));
        char c=0xffff;//最大的char hex十六进制
        System.out.println("c:"+Integer.toBinaryString(c));
        byte b=0x7f;//最大的byte hex十六进制
        System.out.println("b:"+Integer.toBinaryString(b));
        short s=0x7fff;//最大的short hex十六进制
        System.out.println("s:"+Integer.toBinaryString(s));
        long n1=200L;//long后缀
        long n2=200l;//long后缀 但是会混乱(因为有时候l看起来像1)
        long n3=200;
        float f1=1;
        float f2=1F;//float后缀
        float f3=1f;//float后缀
        double d1=1d;//double后缀
        double d2=1D;//double后缀
        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);
        System.out.println(f1);
        System.out.println(f2);
        System.out.println(f3);
        System.out.println(d1);
        System.out.println(d2);
    }
}
