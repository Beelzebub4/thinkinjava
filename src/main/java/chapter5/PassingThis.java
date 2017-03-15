package chapter5;

import org.junit.Test;

/**
 * this传递当前对象
 * <br>Created by 吴海南 on 2017/3/10.
 * <br>星期五 at 15:00.
 */
public class PassingThis {
    class Person{
        public void eat(Apple apple){
            Apple peeled=apple.getPeeled();
            System.out.println("Yummy");
        }
    }
    static class Peeler{
        static Apple peel(Apple apple){
            return apple;
        }

    }
    class Apple{
        Apple getPeeled(){
            return Peeler.peel(this);
        }
    }
    @Test
    public void passThis(){
        new Person().eat(new Apple());
    }
}
