package chapter7;

import static util.Print.println;

/**
 * <br>Created by 吴海南 on 2017/3/20.
 * <br>星期一 at 8:59.
 */
class Villain {
    private String name;

    protected void set(String nm) {
        name = nm;
    }

    public Villain(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "I am a Villain and my name is" + name;
    }
}

public class Orc extends Villain {
    private int orcNumber;

    public Orc(String name, int orcNumber) {
        super(name);
        this.orcNumber = orcNumber;
    }

    public void change(String name, int orcNumber) {
        set(name);
        this.orcNumber = orcNumber;
    }

    @Override
    public String toString() {
        return "Orc " + orcNumber + ": " + super.toString();
    }

    public static void main(String[] args) {
        Orc orc=new Orc("Limburger",12);
        println(orc);
        orc.change("Bob",19);
        println(orc);
    }
}
