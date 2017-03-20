package chapter7;

import org.junit.Test;

/**
 * <br>Created by 吴海南 on 2017/3/16.
 * <br>星期四 at 15:36.
 */
class WaterSource {
    private String s;

    WaterSource() {
        System.out.println("WaterSource()");
        s = "Constructed";
    }

    public String toString() {
        return s;
    }
}
public class SprinklerSystem {
    private String value1, value2, value3, value4;
    private WaterSource waterSource = new WaterSource();
    private int i;
    private float f;

    public String toString() {
        return "value1=" + value1 + " " + "value2=" + value2 + " " + "value3=" + value3 +
                " " + "value4=" + value4 + " " + "i=" + i + " " + "f=" + f + " " +
                "waterSource=" + waterSource;
    }

    @Test
    public void sprinklerSystem() {
        SprinklerSystem sprinklerSystem = new SprinklerSystem();
        System.out.println(sprinklerSystem);
    }
}