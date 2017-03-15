package chapter3;

import org.junit.Test;

/**
 * 三元运算符
 * <br>由于代码可读性的原因，选择性使用
 * <br>Created by 吴海南 on 2017/3/9.
 * <br>星期四 at 10:31.
 */
public class TernaryIfElse {
    static int ternary(int i){
        return i<10?i*100:i*10;
    }
    static int standardIfElse(int i){
        if(i<10){
            return i*100;
        }else {
            return i*10;
        }
    }
    @Test
    public void ternaryIfElse(){
        System.out.println(ternary(9));
        System.out.println(ternary(10));
        System.out.println(standardIfElse(9));
        System.out.println(standardIfElse(10));
    }
}
