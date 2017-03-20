package chapter7;

import static util.Print.printf;
import static util.Print.println;
import static util.Print.printnb;

/**
 * <br>Created by 吴海南 on 2017/3/16.
 * <br>星期四 at 16:12.
 */
class Cleanser{
    private String s="Cleanser";
    public void append(String a){
        s+=a;
    }
    public void dilute(){
        append(" dilute()");
    }
    public void apply(){
        append(" apply()");
    }
    public void scrub(){
        append(" scrub()");
    }

    @Override
    public String toString() {
        return s;
    }

    public static void main(String[] args) {
        Cleanser x=new Cleanser();
        x.dilute();x.apply();x.scrub();
        println(x);
    }
}

/**
 * 继承Cleanser类
 */
public class Detergent extends Cleanser{
    @Override
    public void scrub() {//改变方法
        append(" Detergent.scrub()");
        super.scrub();//Call base-class version
    }
    public void foam(){
        append(" foam()");
    }

    public static void main(String[] args) {
        Detergent x=new Detergent();
        x.dilute();x.apply();
        x.scrub();x.foam();
        printnb(x);
        printf("Testing base class");
        Cleanser.main(args);
    }
}
