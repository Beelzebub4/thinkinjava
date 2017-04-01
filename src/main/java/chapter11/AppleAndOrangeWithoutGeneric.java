package chapter11;

import java.util.ArrayList;

import static util.Print.println;

/**
 * <br>Created by 吴海南 on 2017/4/1.
 * <br>星期六 at 9:03.
 */
class Apple {
    private static long counter;
    private final long id=counter++;
    long id(){
        return id;
    }
}
class Orange{}
public class AppleAndOrangeWithoutGeneric {
    //@SuppressWarnings("unchecked")
    //public static void main(String[] args) {
    //    ArrayList apples=new ArrayList();
    //    for (int i=0;i<3;i++)
    //        apples.add(new Apple());
    //    apples.add(new Orange());
    //    for (Object apple : apples)
    //        ((Apple) apple).id();
    //}
    public static void main(String[] args) {
        ArrayList<Apple> apples=new ArrayList<Apple>();
        for (int i=0;i<3;i++)
            apples.add(new Apple());
        //apples.add(new Orange());//编译错误 不再是运行时错误
        for (Apple apple : apples)
            println(apple.id());
    }
}
