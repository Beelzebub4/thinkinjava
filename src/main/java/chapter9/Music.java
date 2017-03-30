package chapter9;

import chapter8.Note;

import static util.Print.println;

/**
 * <br>Created by 吴海南 on 2017/3/27.
 * <br>星期一 at 15:43.
 */
class Wind implements Instrument {

    public void play(Note note) {
        println(this + ".play() " + note);
    }

    @Override
    public String toString() {
        return "Wind";
    }

    public void adjust() {
        println(this + ".adjust()");
    }
}

class Percussion implements Instrument {

    public void play(Note note) {
        println(this + ".play() " + note);
    }

    @Override
    public String toString() {
        return "Percussion";
    }

    public void adjust() {
        println(this + ".adjust()");
    }
}

class Stringed implements Instrument {

    public void play(Note note) {
        println(this + ".play() " + note);
    }

    @Override
    public String toString() {
        return "Stringed";
    }

    public void adjust() {
        println(this + ".adjust()");
    }
}

class Brass extends Wind {
    @Override
    public String toString() {
        return "Brass";
    }
}

class Woodwind extends Wind {
    @Override
    public String toString() {
        return "Woodwind";
    }
}

public class Music {
    static void tune(Instrument instrument) {
        instrument.play(Note.MIDDLE_C);
    }

    static void tuneAll(Instrument[] instruments) {
        for (Instrument i : instruments) {
            tune(i);
        }
    }

    public static void main(String[] args) {
        Instrument[] orchestra = {
                new Wind(),
                new Percussion(),
                new Stringed(),
                new Brass(),
                new Woodwind()
        };
        tuneAll(orchestra);
    }
}
