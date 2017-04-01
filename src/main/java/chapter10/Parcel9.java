package chapter10;

/**
 * <br>Created by 吴海南 on 2017/3/31.
 * <br>星期五 at 16:35.
 */
public class Parcel9 {
    public Destination destination(final String dest){//dest一定要是final
        return new Destination() {
            private String label=dest;
            public String relabel() {
                return label;
            }
        };
    }

    public static void main(String[] args) {
        Parcel9 p=new Parcel9();
        Destination d=p.destination("Tasmania");
    }
}
