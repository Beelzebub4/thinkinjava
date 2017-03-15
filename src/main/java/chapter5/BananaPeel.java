package chapter5;

import org.junit.Test;

/**
 * <br>Created by 吴海南 on 2017/3/10.
 * <br>星期五 at 14:24.
 */
public class BananaPeel {
    static class Banana {
        void peel(int i) {
            System.out.println(i);
        }
    }

    @Test
    public void bananaPeel() {
        Banana a = new Banana(), b = new Banana();
        a.peel(1);
        b.peel(2);
    }
}
