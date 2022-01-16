package Порождающие.FactoryMethod;

public class SExample {
}

class Manager{
    void calculate(){
        System.out.println("1+1");
    }
    public CFood buildFood(){
        return null;
    }
}
interface CFood{

}
class Meat implements CFood{

}