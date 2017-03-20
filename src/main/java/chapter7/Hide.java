package chapter7;

import static util.Print.println;

/**
 * 名称屏蔽
 * <br>Created by 吴海南 on 2017/3/17.
 * <br>星期五 at 15:27.
 */
class Homer{
    char doh(char c){
        println("doh(char c)");
        return 'd';
    }
    float doh(float f){
        println("doh(float f)");
        return 1.0f;
    }
}
class Milhouse{}
class Bart extends Homer{
    void doh(Milhouse m){
        println("doh(Milhouse m)");
    }
}
public class Hide {
    public static void main(String[] args) {
        Bart b=new Bart();
        b.doh(1);
        b.doh('x');
        b.doh(1.0f);
        b.doh(new Milhouse());
    }
}
