package chapter6;

import chapter5.Cookie;
import org.junit.Test;

import static util.Print.println;

/**
 * <br>Created by 吴海南 on 2017/3/16.
 * <br>星期四 at 13:32.
 */
public class ChocolateChip extends Cookie {
    public ChocolateChip() {
        println("ChocolateChip constructor");
    }

    private void chomp() {
        bite();
    }

    @Test
    public void chocolateChip() {
        //chomp();
        //调用两遍构造器
        ChocolateChip x=new ChocolateChip();
        x.chomp();
    }
}
