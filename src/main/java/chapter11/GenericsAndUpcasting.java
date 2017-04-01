package chapter11;

import java.util.ArrayList;

import static util.Print.println;

/**
 * <br>Created by 吴海南 on 2017/4/1.
 * <br>星期六 at 9:19.
 */
class GrannySmith extends Apple{}
class Gala extends Apple{}
class Fuji extends Apple{}
class Braeburn extends Apple{}
public class GenericsAndUpcasting {
    public static void main(String[] args) {
        ArrayList<Apple> apples=new ArrayList<Apple>();
        apples.add(new GrannySmith());
        apples.add(new Gala());
        apples.add(new Fuji());
        apples.add(new Braeburn());
        for (Apple a:apples)
            println(a);
    }
}
