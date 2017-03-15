package chapter4;

import org.junit.Test;

import java.util.Random;

/**
 * Foreach语法
 * <br>Created by 吴海南 on 2017/3/9.
 * <br>星期四 at 15:44.
 */
public class ForEachFloat {
    @Test
    public void foreachFloat(){
        Random random=new Random(47);
        float f[]=new float[10];
        //旧式for循环组装数组
        for (int i=0;i<10;i++){
            f[i]=random.nextFloat();
        }
        //遍历数组用foreach
        for (float x:f){
            System.out.println(x);
        }
    }
}
