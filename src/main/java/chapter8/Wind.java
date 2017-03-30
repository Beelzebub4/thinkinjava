package chapter8;

import static util.Print.println;

/**
 * <br>Created by 吴海南 on 2017/3/27.
 * <br>星期一 at 9:55.
 */
public class Wind extends Instrument {
    @Override
    public void play(Note note) {
        println("Wind.play()"+note);
    }
}
