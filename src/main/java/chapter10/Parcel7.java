package chapter10;

/**
 * 匿名内部类
 * <br>Created by 吴海南 on 2017/3/31.
 * <br>星期五 at 15:56.
 */
public class Parcel7 {
    public Contents contents(){
        return new Contents(){
            private int i=11;
            public int value(){
                return i;
            }
        };
    }

    public static void main(String[] args) {
        Parcel7 p=new Parcel7();
        Contents c=p.contents();
    }
}
