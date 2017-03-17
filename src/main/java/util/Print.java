package util;

import java.io.PrintStream;

/**
 * <br>Created by 吴海南 on 2017/3/16.
 * <br>星期四 at 10:04.
 */
public class Print {
    //带换行符的打印
    public static void println(Object object){
        System.out.println(object);
    }
    //自身打印换行
    public static void println(){
        System.out.println();
    }
    //不带换行符的打印
    public static void printnb(Object object){
        System.out.print(object);
    }
    //Java SE5 新的打印方法(来自C)
    public static PrintStream printf(String format,Object... args){
        return System.out.printf(format,args);
    }
}
