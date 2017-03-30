package chapter9;

import chapter8.Note;

/**
 * <br>Created by 吴海南 on 2017/3/27.
 * <br>星期一 at 15:38.
 */
public interface Instrument {
    int value=5;
    void play(Note note);
    void adjust();
}
