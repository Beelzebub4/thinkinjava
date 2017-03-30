package chapter9;

/**
 * <br>Created by 吴海南 on 2017/3/27.
 * <br>星期一 at 16:24.
 */
class Processor{
    public String name(){
        return getClass().getSimpleName();
    }
    Object processor(Object input){
        return input;
    }
}
class Upcase extends Processor{
    String processor(Object input){
            return ((String) input).toUpperCase();
    }
}
class Downcase extends Processor{
    String processor(Object input){
        return ((String) input).toLowerCase();
    }
}

public class Apply {
}
