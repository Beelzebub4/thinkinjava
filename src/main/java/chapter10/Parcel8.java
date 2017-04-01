package chapter10;

/**
 * <br>Created by 吴海南 on 2017/3/31.
 * <br>星期五 at 16:19.
 */
public class Parcel8 {
    public Wrapping wrapping(int x){
        return new Wrapping(x){
            public int value(){
                return super.value()*47;
            }
        };
    }

    public static void main(String[] args) {
        Parcel8 p=new Parcel8();
        Wrapping w=p.wrapping(10);
    }
}
