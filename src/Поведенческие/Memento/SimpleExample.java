package Поведенческие.Memento;

public class SimpleExample {
    public static void main(String[] args) {
        JPoint x = new JPoint();
        x.move(10);
        Memento m = x.createMemento();
        x.move(100);
        x.uploadUseMemento(m);
    }
}

class Memento{
    int x;
    void setValue(int _x){
        x = _x;
    }
    int getX(){
        return x;
    }
}
class JPoint{
    int x;
    //some methods
    void draw(){}
    void move(int dx){
        x+=dx;
    }
    Memento createMemento(){
        Memento m = new Memento();
        m.setValue(x);
        return m;
    }
    void uploadUseMemento(Memento one){
        x = one.getX();
    }
}