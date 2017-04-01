package chapter11;

import java.util.ArrayList;
import java.util.Collection;

import static util.Print.printnb;

/**
 * <br>Created by 吴海南 on 2017/4/1.
 * <br>星期六 at 10:16.
 */
public class SimpleCollection {
    public static void main(String[] args) {
        Collection<Integer> c=new ArrayList<Integer>();
        for (int i=0;i<10;i++)
            c.add(i);
        for (Integer i:c)
            printnb(i+", ");
    }
}
