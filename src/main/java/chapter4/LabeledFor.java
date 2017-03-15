package chapter4;

import org.junit.Test;

/**
 * for循环里使用中断关键字
 * <br>一般的 continue 会回到最内层循环的开头并继续执行
 * <br>带标签的continue会回到标签位置 并执行标签后面的循环
 * <br>break会中断并跳出当前循环 继续执行代码
 * <br>带标签的break会中断并跳出标签所指的循环
 * <br>Created by 吴海南 on 2017/3/10.
 * <br>星期五 at 9:16.
 */
public class LabeledFor {
    @Test
    public void labeledFor() {
        int i = 0;
        outer:
        for (; true; ) {
            inner:
            for (; i < 10; i++) {
                System.out.println("i=" + i);
                if (i == 2) {
                    System.out.println("continue");
                    continue;
                }
                if (i == 3) {
                    System.out.println("break");
                    i++;
                    break;
                }
                if (i == 7) {
                    System.out.println("continue outer");
                    i++;
                    continue outer;
                }
                if (i == 8) {
                    System.out.println("break outer");
                    break outer;
                }
                for (int k = 0; k < 5; k++) {
                    if (k == 3) {
                        System.out.println("continue inner k=" + k);
                        continue inner;
                    }
                }
            }
        }
    }

    @Test
    public void labeledWhile() {
        int i = 0;
        outer:
        while (true) {
            System.out.println("Outer while loop");
            while (true) {
                i++;
                System.out.println("i=" + i);
                if (i == 1) {
                    System.out.println("continue");
                    continue;
                }
                if (i == 3) {
                    System.out.println("continue outer");
                    continue outer;
                }
                if (i == 5) {
                    System.out.println("break");
                    break;
                }
                if (i == 7) {
                    System.out.println("break outer");
                    break outer;
                }
            }
        }
    }
}
