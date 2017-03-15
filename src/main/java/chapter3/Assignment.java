package chapter3;

import org.junit.Test;

/**
 * 对象赋值
 * Created by 吴海南 on 2017/3/6.<br>
 * 星期一 at 14:21.
 */
public class Assignment {
    class Tank{
        int level;
    }
    @Test
    public void assignment(){
        Tank tank1=new Tank();
        Tank tank2=new Tank();
        tank1.level=9;
        tank2.level=47;
        System.out.println("1:tank1.level="+tank1.level+" tank2.level="+tank2.level);
        tank1=tank2;
        System.out.println("2:tank1.level="+tank1.level+" tank2.level="+tank2.level);
        tank1.level=27;
        System.out.println("3:tank1.level="+tank1.level+" tank2.level="+tank2.level);
    }
}
