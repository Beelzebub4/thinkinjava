package chapter11;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

import static util.Print.println;

/**
 * <br>Created by 吴海南 on 2017/4/1.
 * <br>星期六 at 11:25.
 */
public class SetOfInteger {
    public static void main(String[] args) {
        Random random=new Random(47);
        Set<Integer> integerSet=new HashSet<Integer>(100);
        for(int i=0;i<10000;i++)
            integerSet.add(random.nextInt(20));
        println(integerSet);
    }
}
