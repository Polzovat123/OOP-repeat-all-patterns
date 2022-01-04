package Порождающие.Prototype;

public class SimpleExample {

    public static void main(String[] args) {
        CShape fig1 = new CShape(23);
        fig1.draw();
        CShape fig2 = (CShape) fig1.clone();
        fig2.draw();
    }
}


interface Prototype{
    Prototype clone();
}

class CShape implements Prototype{
    public int x, y;
    public CShape(){
        x = 100;
        y = 100;
    }

    public CShape(int h){
        x = y = h;
    }
    public CShape(CShape obj){
        x = obj.x + 100;
        y = obj.y - 100;
    }
    @Override
    public Prototype clone() {
        return new CShape(this);
    }
    public void draw(){
        System.out.println("I am a object :"+x+" "+y);
    }
}