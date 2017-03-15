package chapter5;

import org.junit.Test;

/**
 * this关键字
 * <br>Created by 吴海南 on 2017/3/10.
 * <br>星期五 at 14:51.
 */
public class Apricot {
    void pick() {

    }

    void pit() {
        pick();
    }

    class Leaf {
        int i = 0;

        Leaf increment() {
            i++;
            return this;
        }

        void print() {
            System.out.println("i=" + i);
        }
    }
    @Test
    public void leaf(){
        Leaf x=new Leaf();
        x.increment().increment().increment().print();
    }
}
