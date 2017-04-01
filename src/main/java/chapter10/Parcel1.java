package chapter10;

import static util.Print.println;

/**
 * <br>Created by 吴海南 on 2017/3/31.
 * <br>星期五 at 14:24.
 */
public class Parcel1 {
    class Contents{
        private int i=11;
        public int value(){
            return i;
        }
    }
    class Destination{
        private String label;

        Destination(String whereTo) {
            label = whereTo;
        }
        String reLabel(){
            return label;
        }
    }
    public void ship(String dest){
        Contents c=new Contents();
        Destination d=new Destination(dest);
        println(d.reLabel());
    }

    public static void main(String[] args) {
        Parcel1 p=new Parcel1();
        p.ship("Tasmania");
    }
}
