package chapter3;

import org.junit.Test;

/**
 * 测试对象的等价性
 * Created by 吴海南 on 2017/3/7.<br>
 * 星期二 at 14:48.
 */
public class Equivalence {
    @Test
    public void equivalence(){
        Integer n1=new Integer(47);
        Integer n2=new Integer(47);
        System.out.println(n1==n2);
        System.out.println(n1.equals(n2));
    }
    class Value{
        int i;
    }
    @Test
    public void equalsMethod(){
        Value v1=new Value();
        Value v2=new Value();
        v1.i=v2.i=100;
        System.out.println(v1.equals(v2));
        System.out.println(v1.i==(v2.i));
    }
}
