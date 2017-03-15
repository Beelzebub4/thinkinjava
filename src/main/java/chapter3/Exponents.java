package chapter3;

import org.junit.Test;

/**
 * 指数计数示例
 * <br>Created by 吴海南 on 2017/3/8.
 * <br>星期三 at 9:59.
 */
public class Exponents {
    @Test
    public void exponents() {

        float expFloat = 1.39e-43f;
        expFloat=1.39E-43f;
        System.out.println(expFloat);
        double expDouble1=47e47d;
        double expDouble2=47e47;
        System.out.println(expDouble1);
        System.out.println(expDouble2);
    }
}
