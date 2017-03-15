package chapter3;

import org.junit.Test;
import util.AllTest;

/**
 * 运算符优先级<br>
 * Created by 吴海南 on 2017/3/6.<br>
 * 星期一 at 14:09.
 */
public class Precedence extends AllTest{
    @Test
    public void precedence(){
        int x=1,y=2,z=3;
        int a=x+y-2/2+z;
        int b=x+(y-2)/(2+z);
        System.out.println("a="+a+" b="+b);
    }
}
