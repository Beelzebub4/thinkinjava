package chapter8;

/**
 * <br>Created by 吴海南 on 2017/3/27.
 * <br>星期一 at 9:56.
 */
public class Music {
    public static void tune(Instrument instrument){
        instrument.play(Note.MIDDLE_C);
    }

    public static void main(String[] args) {
        Wind flute=new Wind();
        tune(flute);//向上转型
    }
}
