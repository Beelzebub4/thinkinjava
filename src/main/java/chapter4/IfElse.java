package chapter4;

import org.junit.Test;

/**
 * if-else
 * <br>Created by 吴海南 on 2017/3/9.
 * <br>星期四 at 11:11.
 */
public class IfElse {
    static int result = 0;

    static void test(int testval, int target) {
        if (testval > target) {
            result = +1;
        } else if (testval < target) {
            result = -1;
        } else {
            result = 0;
        }
    }
    @Test
    public void ifElse(){
        test(10,5);
        System.out.println(result);
        test(5,10);
        System.out.println(result);
        test(5,5);
        System.out.println(result);
    }
    static int test2(int testval,int target){
        if(testval>target){
            return +1;
        }else if (testval<target){
            return -1;
        }else {
            return 0;
        }
    }

    /**
     * return关键字有两个用途
     * <br>第一、指定一个方法返回什么值
     * <br>第二、导致当前方法退出，并返回那个值
     */
    @Test
    public void ifElse2(){
        System.out.println(test2(10,5));
        System.out.println(test2(5,10));
        System.out.println(test2(10,10));
    }
}
