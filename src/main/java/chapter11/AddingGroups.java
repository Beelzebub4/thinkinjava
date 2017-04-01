package chapter11;

import java.util.*;

import static util.Print.printnb;

/**
 * <br>Created by 吴海南 on 2017/4/1.
 * <br>星期六 at 10:24.
 */
public class AddingGroups {
    public static void main(String[] args) {
        Collection<Integer> collection =
                new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5));
        Integer[] moreInts={6,7,8,9,10};
        collection.addAll(Arrays.asList(moreInts));
        Collections.addAll(collection,11,12,13,14,15);
        Collections.addAll(collection,moreInts);
        //for (Integer i:collection)
        //    printnb(i+", ");
        List<Integer> list=Arrays.asList(16,17,18,19,20);
        list.set(1,99);
        //使用Iterator迭代器或者转化成ArrayList 就不会出现下面的异常
        //List<Integer> list1=new ArrayList<Integer>(list);
        //list1.add(21);//运行时异常 Arrays.asList底层表示的是数组 不能调整尺寸
        // 不支持add() remove()
        for (Integer i:list)
            printnb(i+", ");

    }
}
