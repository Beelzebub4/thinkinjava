package chapter6;

import static util.Print.println;

/**
 * <br>Created by 吴海南 on 2017/3/16.
 * <br>星期四 at 17:03.
 */
class Art{
    Art() {
        println("Art constructor");
    }
}
class Drawing extends Art{
     Drawing() {
        println("Drawing constructor");
     }
}
public class Cartoon extends Drawing{
    private Cartoon() {
        println("Cartoon constructor");
    }

    //@Test
    //public void cartoon(){
    //    Cartoon cartoon=new Cartoon();
    //}
    public static void main(String[] args) {
        Cartoon cartoon=new Cartoon();
        println(cartoon);
    }
}
