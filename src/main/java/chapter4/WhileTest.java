package chapter4;

import org.junit.Test;

/**
 * 迭代
 * <br>Created by 吴海南 on 2017/3/9.
 * <br>星期四 at 11:17.
 */
public class WhileTest {
    static boolean condition() {
        boolean result = Math.random() < 0.99;
        System.out.println(result + ", ");
        return result;
    }

    @Test
    public void whileTest() {
        while (condition()) {
            System.out.println("Inside While");
        }
        System.out.println("Exited While");
    }

    /**
     * 与while区别在于至少会执行一次
     * <br>实际运用中while更加常用一些
     */
    @Test
    public void doWhileTest() {
        do {
            System.out.println("Inside do-while");
        } while (condition());
        System.out.println("Exited do-while");
    }

    /**
     * for循环
     */
    @Test
    public void listCharacters() {
        for (char c = 0; c < 128; c++) {
            if (Character.isLetter(c)) {
                System.out.println("value=" + (int) c + " character=" + c);
            }else {
                System.out.println("不是字母value=" + (int) c + " character=" + c);
            }
        }
    }
    @Test
    public void commaOperator(){
        for (int i=1,j=i+10;i<5;i++,j=i*2){
            System.out.println("i="+i+" j="+j);
        }
    }
}
