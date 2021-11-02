class DriverClass {
    public static void main(String[] args) {
        Line l = new Line();
        Rectangle r = new Rectangle();
        Cube c = new Cube();

        l.draw();     // draw method of line
        r.draw();     // draw method of rectangle
        c.draw();     // draw methos od cube
    }
}




public abstract class Shape {
    abstract void draw();
}

class Line extends Shape {

    @Override
    void draw() {
        System.out.println("A line is drawn here.");
    }
}
class Rectangle extends Shape {

    @Override
    void draw() {
        System.out.println("A rectangle is drwan here.");
    }
}
class Cube extends Shape{

    @Override
    void draw() {
        System.out.println("A cube is drawn here.");
    }
}
