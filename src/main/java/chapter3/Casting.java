package chapter3;

import org.junit.Test;

/**
 * cast 类型转换(原意'模型铸造')
 * <br>Created by 吴海南 on 2017/3/9.
 * <br>星期四 at 10:46.
 */
public class Casting {
    @Test
    public void casting(){
        int i=200;
        long lng=(long) i;
        //编译器自动转换int到long
        //但是我们仍然可以做这些多余的事情
        //可以使代码更清楚
        lng=i;
        long lng2=(long) 200;
        lng2=200;
        i= (int) lng2;
    }
}
