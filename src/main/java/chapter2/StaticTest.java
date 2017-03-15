package chapter2;

import org.junit.Test;

/**
 * 静态变量静态方法的调用<br>
 * Created by 吴海南 on 2017/3/6.<br>
 * 星期一 at 10:59.
 */
public class StaticTest {
    static int i = 47;
    static void increment(){
        StaticTest.i++;
    }
    @Test
    public void staticTest(){
        StaticTest staticTest1=new StaticTest();
        System.out.println(staticTest1.i);

        StaticTest staticTest2=new StaticTest();
        System.out.println(staticTest2.i);

        StaticTest staticTest3=new StaticTest();
        staticTest3.increment();//句柄调用
        StaticTest.increment();//类名调用
        System.out.println(staticTest3.i);
        System.out.println(staticTest2.i);
        System.out.println(staticTest1.i);
    }
}
