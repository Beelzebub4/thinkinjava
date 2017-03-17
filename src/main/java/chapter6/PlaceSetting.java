package chapter6;

import static util.Print.println;

/**
 * 同时使用组合和继承
 * <br>Created by 吴海南 on 2017/3/17.
 * <br>星期五 at 9:58.
 */
class Plate {
    Plate(int i) {
        println("Plate Constructor");
    }
}

class DinnerPlate extends Plate {

    DinnerPlate(int i) {
        super(i);
        println("DinnerPlate Constructor");
    }
}
class Utensil{
     Utensil(int i) {
        println("Utensil Constructor");
    }
}
class Spoon extends Utensil{

    Spoon(int i) {
        super(i);
        println("Spoon Constructor");
    }
}
class Fork extends Utensil{

    Fork(int i) {
        super(i);
        println("Fork Constructor");
    }
}
class Knife extends Utensil{

    Knife(int i) {
        super(i);
        println("Knife Constructor");
    }
}
class Custom{
     Custom(int i) {
         println("Custom Constructor");
    }
}
public class PlaceSetting extends Custom{
    private Spoon spoon;
    private Fork fork;
    private Knife knife;
    private DinnerPlate dinnerPlate;
    public PlaceSetting(int i) {
        super(i);
        spoon=new Spoon(i+2);
        fork=new Fork(i+3);
        knife=new Knife(i+4);
        dinnerPlate=new DinnerPlate(i+5);
        println("PlaceSetting Constructor");
    }

    public static void main(String[] args) {
        PlaceSetting x=new PlaceSetting(9);
    }
}
