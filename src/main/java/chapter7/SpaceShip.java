package chapter7;

/**
 * 太空船
 * <br>Created by 吴海南 on 2017/3/17.
 * <br>星期五 at 8:55.
 */
public class SpaceShip extends SpaceShipControls {
    private String name;

    public SpaceShip(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    public static void main(String[] args) {
        SpaceShip protector=new SpaceShip("NSEA Protector");
        protector.forward(100);
    }
}
