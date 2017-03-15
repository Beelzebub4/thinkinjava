package chapter3;

import org.junit.Test;

/**
 * 自动递增和递减<br>
 * Created by 吴海南 on 2017/3/7.<br>
 * 星期二 at 14:38.
 */
public class AutoInc {
    @Test
    public void autoInc() {
        int i = 1;
        System.out.println("  i=" + i);
        System.out.println("++i=" + ++i);
        System.out.println("i++=" + i++);
        System.out.println("  i=" + i);
        System.out.println("--i=" + --i);
        System.out.println("i--=" + i--);
        System.out.println("  i=" + i);
    }
}
