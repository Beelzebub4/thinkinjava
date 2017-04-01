package chapter10;

/**
 * <br>Created by 吴海南 on 2017/3/31.
 * <br>星期五 at 16:08.
 */
public class Parcel7b {
    class MyContents implements Contents{

        private int i=11;
        public int value() {
            return i;
        }
    }
    public Contents contents(){
        return new MyContents();
    }

    public static void main(String[] args) {
        Parcel7b p=new Parcel7b();
        Contents c=p.contents();
    }
}
