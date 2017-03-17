package chapter6;

import org.junit.Test;

/**
 * 不能访问私有构造器
 * <br>必须通过调用makeASundae()方法
 * <br>Created by 吴海南 on 2017/3/16.
 * <br>星期四 at 13:14.
 */
public class IceCream {
    @Test
    public void iceCream(){
        //私有的无法访问
        //Sundae x=new Sundae();
        Sundae y=Sundae.makeASundae();
    }
}
