package chapter5;

import org.junit.Test;

/**
 * 练习题
 * <br>Created by 吴海南 on 2017/3/10.
 * <br>星期五 at 10:41.
 */
public class Exercise {
    class Str1 {
        String str1;
        Str1() {
            System.out.println(str1);
        }
    }
class Str2{
        //定义时就被初始化
        String str2="str2";
        //通过构造器初始化
        Str2(String str3){

        }
}
    /**
     * 练习1
     */
    @Test
    public void expercise() {
        new Str1();
    }
}
