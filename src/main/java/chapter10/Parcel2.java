package chapter10;

import static util.Print.println;

/**
 * <br>Created by 吴海南 on 2017/3/31.
 * <br>星期五 at 14:32.
 */
public class Parcel2 {
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
    public Destination to(String s){
        return new Destination(s);
    }
    public Contents contents(){
        return new Contents();
    }
    public void ship(String dest){
        Contents c=new Contents();
        Destination d=new Destination(dest);
        println(d.reLabel());
    }

    public static void main(String[] args) {
        Parcel2 p=new Parcel2();
        p.ship("Tasmania");
        Parcel2 q=new Parcel2();
        Parcel2.Contents c=q.contents();
        Parcel2.Destination d=q.to("Borneo");
    }
}
