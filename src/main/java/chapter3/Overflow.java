package chapter3;

import org.junit.Test;

/**
 * 溢出的结果
 * <br>Created by 吴海南 on 2017/3/9.
 * <br>星期四 at 11:05.
 */
public class Overflow {
    @Test
    public void overflow() {
        int big = Integer.MAX_VALUE;
        System.out.println(big);
        //结果溢出 但是编译器并没有报错 运行也正常
        int bigger = big * 4;
        System.out.println(bigger);
    }
}
