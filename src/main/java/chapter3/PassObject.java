package chapter3;

import org.junit.Test;

/**
 * 方法调用中别名问题
 * Created by 吴海南 on 2017/3/6.<br>
 * 星期一 at 14:29.
 */
public class PassObject {
    class Letter{
        char c;
    }

    static void f(Letter y){
        y.c='z';
    }
    @Test
    public void passObject(){
        Letter x=new Letter();
        x.c='a';
        System.out.println("1:x.c="+x.c);
        f(x);
        System.out.println("2:x.c="+x.c);
    }
}
