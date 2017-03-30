package chapter7;

/**
 * <br>Created by 吴海南 on 2017/3/20.
 * <br>星期一 at 9:29.
 */
class Instrument{
    public void play(){}
    static void tune(Instrument instrument){
        instrument.play();
    }
}
public class Wind extends Instrument{
    public static void main(String[] args) {
        Wind flute=new Wind();
        Instrument.tune(flute);
    }
}
