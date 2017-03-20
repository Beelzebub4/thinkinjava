package chapter7;

import org.junit.Test;

import static util.Print.println;

/**
 * <br>Created by 吴海南 on 2017/3/16.
 * <br>星期四 at 17:13.
 */
class Game {
    Game(int i) {
        println("Game constructor");
    }
}

class BoardGame extends Game {

    BoardGame(int i) {
        super(i);
        println("BoardGame constructor");
    }
}

public class Chess extends BoardGame {

    public Chess() {
        super(11);
        println("Chess constructor");
    }

    @Test
    public void chess() {
        Chess chess = new Chess();
    }

    public static void main(String[] args) {
        Chess chess = new Chess();
    }
}
