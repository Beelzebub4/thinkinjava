package chapter3;

import org.junit.Test;

import java.util.Random;

/**
 * 逻辑操作符
 * <br>Created by 吴海南 on 2017/3/7.
 * <br>星期二 at 15:17.
 */
public class Bool {
    @Test
    public void bool() {
        Random random = new Random(47);
        int i = random.nextInt(100);
        int j = random.nextInt(100);
        System.out.println("i=" + i);
        System.out.println("j=" + j);
        System.out.println("i>j is " + (i > j));
        System.out.println("i<j is " + (i < j));
        System.out.println("i>=j is " + (i >= j));
        System.out.println("i<=j is " + (i <= j));
        System.out.println("i==j is " + (i == j));
        System.out.println("i!=j is " + (i != j));
        //非布尔值不能用在逻辑表达式中
        //System.out.println("(i&&j) is "+(i&&j));
        System.out.println("(i<56)&&(j<56) is " + ((i < 56) && (j < 56)));
        System.out.println("(i<56)||(j<56) is " + ((i < 56) || (j < 56)));
    }

}
