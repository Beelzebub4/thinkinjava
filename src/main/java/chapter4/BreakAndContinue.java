package chapter4;

import org.junit.Test;

/**
 * Break和Continue关键字
 * <br>Created by 吴海南 on 2017/3/9.
 * <br>星期四 at 16:58.
 */
public class BreakAndContinue {
    @Test
    public void breakAndContinue() {
        for (int i = 0; i < 100; i++) {
            if (i == 74) break;//跳出循环
            if (i % 9 != 0) continue;//继续执行
            System.out.println(i + " ");
        }
        //无限循环
        int i = 0;
        while (true) {
            i++;
            int j = i * 27;
            if (j == 1269) break;
            if (i % 10 != 0) continue;
            System.out.println(i + " ");
        }
    }
}
