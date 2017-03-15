package chapter2;

import org.junit.Test;

/**
 * 变量初始值
 * Created by 吴海南 on 2017/3/6.<br>
 * 星期一 at 9:38.
 */
public class VariableInitialValueTest {
    private boolean a;
    private char b;
    private byte c;
    private short d;
    private int e;
    private long f;
    private float g;
    private double h;

    /**
     *
     */
    @Test
    public void variableInitialValue(){
        System.out.println("boolean类型初始值"+a);
        System.out.println("char类型初始值" + b);
        System.out.println("byte类型初始值"+c);
        System.out.println("short类型初始值"+d);
        System.out.println("int类型初始值"+e);
        System.out.println("long类型初始值"+f);
        System.out.println("float类型初始值"+g);
        System.out.println("double类型初始值"+h);
    }
}