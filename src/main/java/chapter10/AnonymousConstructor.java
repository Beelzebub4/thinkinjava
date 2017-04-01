package chapter10;

import static util.Print.println;

/**
 * <br>Created by 吴海南 on 2017/3/31.
 * <br>星期五 at 16:45.
 */
abstract class Base{
    public Base(int i) {
        println("Base constructor.i="+i);
    }
    public abstract void f();
}
public class AnonymousConstructor {
    public static Base getBase(int i){
        return new Base(i) {
            {println("Inside instance initializer");}
            public void f(){
                println("In anonymous f()");
            }
        };
    }

    public static void main(String[] args) {
        Base base=getBase(47);
        base.f();
    }
}
