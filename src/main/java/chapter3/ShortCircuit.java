package chapter3;

import org.junit.Test;

/**
 * 逻辑运算短路
 * <br>Created by 吴海南 on 2017/3/8.
 * <br>星期三 at 9:34.
 */
public class ShortCircuit {
    static boolean test01(int val){
        System.out.println("test01("+val+")");
        System.out.println("result:"+(val<1));
        return val<1;
    }
    static boolean test02(int val){
        System.out.println("test02("+val+")");
        System.out.println("result:"+(val<2));
        return val<2;
    }
    static boolean test03(int val){
        System.out.println("test03("+val+")");
        System.out.println("result:"+(val<3));
        return val<3;
    }
    @Test
    public void shortCircuit(){
        boolean b=test01(0)&&test02(2)&&test03(2);
        System.out.println(" expression is "+b);
    }
}
