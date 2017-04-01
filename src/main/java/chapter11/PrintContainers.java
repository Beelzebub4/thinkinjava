package chapter11;

import java.util.*;

import static util.Print.println;

/**
 * <br>Created by 吴海南 on 2017/4/1.
 * <br>星期六 at 10:46.
 */
public class PrintContainers {
    private static Collection fill(Collection<String> collection){
        collection.add("rat");
        collection.add("cat");
        collection.add("dog");
        collection.add("dog");
        return collection;
    }
    private static Map fill(Map<String, String> map){
        map.put("rat","Fuzzy");
        map.put("cat","Rags");
        map.put("dog","Bos");
        map.put("dog","Spot");
        return map;
    }

    public static void main(String[] args) {
        println(fill(new ArrayList<String>()));
        println(fill(new LinkedList<String>()));
        println(fill(new HashSet<String>()));
        println(fill(new TreeSet<String>()));
        println(fill(new LinkedHashSet<String>()));
        println(fill(new HashMap<String, String>()));
        println(fill(new TreeMap<String, String>()));
        println(fill(new LinkedHashMap<String, String>()));
    }
}
