package Структурные.Decorator;

public class SimpleExample {
    public static void main(String[] args) {

    }
}


interface Shape{
    void draw();
    void move(int dx, int dy);
}

class Circle implements Shape{

    @Override
    public void draw() {

    }

    @Override
    public void move(int dx, int dy) {

    }
}

class SlickShapeDecorator implements Shape{
    private Shape body;

    public SlickShapeDecorator(Shape obj){
        body = obj;
    }

    @Override
    public void draw() {
        body.draw();
    }

    @Override
    public void move(int dx, int dy) {
        body.move(dx, dy);
    }
    public void slick(){

    }
}