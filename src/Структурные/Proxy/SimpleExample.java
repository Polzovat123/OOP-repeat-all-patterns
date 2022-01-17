package Структурные.Proxy;

public class SimpleExample {
    public static void main(String[] args) {
        BProxy a = new BProxy();
        a.printSomeInfo();
    }
}
interface SomeClass{
    void printSomeInfo();
    default void println(Object o){
        System.out.println(o);
    }
}
class A implements SomeClass{

    @Override
    public void printSomeInfo() {
        println("I work.");
    }
}
class BProxy implements SomeClass{
    private A some_obj;

    public BProxy(){
        some_obj = new A();
    }

    @Override
    public void printSomeInfo() {
        println("Now we do some good");
        some_obj.printSomeInfo();
        println("work finished.");
    }
}