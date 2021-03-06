package chapter5;

/**
 * 构造器调用构造器
 * <br>Created by 吴海南 on 2017/3/10.
 * <br>星期五 at 16:03.
 */
public class Flower {
    int petalCount = 0;
    String s = "initial value";

    Flower(int petals) {
        petalCount = petals;
        System.out.println("Constructor int arg only petalCount=" + petalCount);
    }

    Flower(String ss) {
        System.out.println("Constructor String arg only ss=" + ss);
        s = ss;
    }

    Flower(String s, int petals) {
        this(petals);
        this.s = s;
        System.out.println("String & int args");
    }

    Flower() {
        this("hi", 47);
        System.out.println("default constructor (no arg)");
    }

    void printPetalCount() {
        System.out.println("petalCount=" + petalCount + " s=" + s);
    }

    public static void main(String[] args) {
        Flower x = new Flower();
        x.printPetalCount();
    }
}
