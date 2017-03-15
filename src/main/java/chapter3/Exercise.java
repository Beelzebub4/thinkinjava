package chapter3;

import org.junit.Test;

import java.util.Random;

/**
 * 练习
 * Created by 吴海南 on 2017/3/7.<br>
 * 星期二 at 14:59.
 */
public class Exercise {
    class Dog{
        String name;
        String says;

        public Dog() {
        }

        public Dog(String name, String says) {
            this.name = name;
            this.says = says;
        }
    }

    /**
     * 练习5和6
     */
    @Test
    public void exercise5(){
        Dog dog1=new Dog("spot","Ruff!");
        Dog dog2=new Dog("scruffy","Wurf!");
        System.out.println("name:"+dog1.name+" says:"+dog1.says);
        System.out.println("name:"+dog2.name+" says:"+dog2.says);
        Dog dog3;
        dog3=dog1;
        System.out.println(dog1==dog2);
        System.out.println(dog1==dog3);
        System.out.println(dog3==dog2);
        System.out.println(dog1.equals(dog2));
        System.out.println(dog1.equals(dog3));
        System.out.println(dog3.equals(dog2));
    }

    /**
     * 练习7
     */
    @Test
    public void exercise7(){
        Random random=new Random();
        System.out.println(random.nextBoolean()?"正面":"反面");//执行一次
        //循环执行
        int i=1;
        while (i<=100){
            System.out.println(random.nextBoolean()?"正面":"反面");
            i++;
        }
    }
}
