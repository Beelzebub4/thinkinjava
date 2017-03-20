package chapter6;

import org.jetbrains.annotations.Contract;

/**
 * <br>Created by 吴海南 on 2017/3/16.
 * <br>星期四 at 13:16.
 */
class Sundae{
    private Sundae(){}
    @Contract(" -> !null")
    static Sundae makeASundae(){
        return new Sundae();
    }
}
