package chapter3;

import org.junit.Test;

/**
 * 截取和舍入
 * <br>Created by 吴海南 on 2017/3/9.
 * <br>星期四 at 10:54.
 */
public class CastingNumbers {
    @Test
    public void castingNumbers() {
        double above = 0.7, below = 0.4;
        float fabove = 0.7f, fbelow = 0.4f;
        System.out.println("(int) above=" + (int) above);
        System.out.println("(int) below=" + (int) below);
        System.out.println("(int) fabove=" + (int) fabove);
        System.out.println("(int) fbelow=" + (int) fbelow);
    }
    @Test
    public void roundingNumbers(){
        double above = 0.7, below = 0.4;
        float fabove = 0.7f, fbelow = 0.4f;
        System.out.println("(int) above=" + Math.round(above));
        System.out.println("(int) below=" + Math.round(below));
        System.out.println("(int) fabove=" + Math.round(fabove));
        System.out.println("(int) fbelow=" + Math.round(fbelow));
    }
}
