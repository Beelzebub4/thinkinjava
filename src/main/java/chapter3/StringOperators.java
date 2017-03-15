package chapter3;

import org.junit.Test;

/**
 * 字符串操作符+和+=
 * <br>Created by 吴海南 on 2017/3/9.
 * <br>星期四 at 10:39.
 */
public class StringOperators {
    @Test
    public void stringOperators() {
        int x = 0, y = 1, z = 2;
        String s = "x,y,z";
        System.out.println(s + x + y + z);
        System.out.println(x + " " + s);
        s += "(summed) = ";
        System.out.println(s+(x+y+z));
        System.out.println(""+x);
    }
}
