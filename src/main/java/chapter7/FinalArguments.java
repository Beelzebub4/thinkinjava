package chapter7;

/**
 * <br>Created by 吴海南 on 2017/3/20.
 * <br>星期一 at 13:34.
 */
class Gizmo {
    public void spin() {
       }
}

public class FinalArguments {
    void with(final Gizmo g) {

    }

    void without(Gizmo g) {
        g = new Gizmo();
        g.spin();
    }
}
