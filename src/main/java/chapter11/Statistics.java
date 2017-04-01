package chapter11;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import static util.Print.println;

/**
 * <br>Created by 吴海南 on 2017/4/1.
 * <br>星期六 at 14:23.
 */
public class Statistics {
    public static void main(String[] args) {
        Random random = new Random(47);
        Map<Integer, Integer> m = new HashMap<Integer, Integer>();
        for (int i = 0; i < 10000; i++) {
            int r = random.nextInt(20);
            Integer freq=m.get(r);
            m.put(r,freq==null?1:freq+1);
        }
        println(m);
    }
}
