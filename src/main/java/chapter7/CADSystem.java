package chapter7;

import static util.Print.println;

/**
 * <br>Created by 吴海南 on 2017/3/17.
 * <br>星期五 at 13:19.
 */
class Shape {
    Shape(int i) {
        println("Shape Constructor");
    }

    void dispose() {
        println("Shape dispose()");
    }
}

class Circle extends Shape {

    Circle(int i) {
        super(i);
        println("Drawing Circle");
    }

    @Override
    void dispose() {
        println("Erasing Circle");
        super.dispose();
    }
}

class Triangle extends Shape {

    Triangle(int i) {
        super(i);
        println("Drawing Triangle");
    }

    @Override
    void dispose() {
        println("Erasing Triangle");
        super.dispose();
    }
}

class Line extends Shape {
    private int start, end;

    Line(int start, int end) {
        super(start);
        this.start = start;
        this.end = end;
        println("Drawing Line" + start + ", " + end);
    }

    @Override
    void dispose() {
        println("Erasing Line" + start + ", " + end);
        super.dispose();
    }
}

public class CADSystem extends Shape {
    private Circle circle;
    private Triangle triangle;
    private Line[] lines = new Line[3];

    public CADSystem(int i) {
        super(i);
        for (int j = 0; j < lines.length; j++)
            lines[j] = new Line(j, j * j);
        circle = new Circle(1);
        triangle = new Triangle(1);
        println("Combined Constructor");
    }

    @Override
    public void dispose() {
        println("CADSystem.dispose()");
        circle.dispose();
        triangle.dispose();
        for (int i = lines.length - 1; i >= 0; i--)
            lines[i].dispose();
        super.dispose();
    }

    public static void main(String[] args) {
        CADSystem x=new CADSystem(47);
        try {
            //捕捉异常
        } finally {
            x.dispose();
        }
    }
}
