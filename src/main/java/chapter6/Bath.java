package chapter6;

import org.junit.Test;

import static util.Print.println;

/**
 * <br>Created by 吴海南 on 2017/3/16.
 * <br>星期四 at 15:53.
 */
class Soap {
    private String s;

    Soap() {//构造器中初始化
        println("Soap()");
        s = "Constructed";
    }

    public String toString() {
        return s;
    }
}

public class Bath {
    private String//定义时初始化
            s1 = "Happy",
            s2 = "Happy",
            s3, s4;
    private Soap castille;
    private int i;
    private float toy;

    public Bath() {
        println("Inside Bath()");
        s3 = "joy";
        toy = 1.34f;
        castille = new Soap();
    }

    {
        i = 47;
    }//实例初始化

    @Override
    public String toString() {
        if (s4 == null)//惰性初始化
            s4 = "joy";
        return
                "s1=" + s1 + "\n" +
                "s2=" + s2 + "\n" +
                "s3=" + s3 + "\n" +
                "s4=" + s4 + "\n" +
                "i=" + i + "\n" +
                "toy=" + toy + "\n" +
                "castille=" + castille + "\n" ;
    }
    @Test
    public void bath(){
        Bath bath=new Bath();
        println(bath);
    }
}