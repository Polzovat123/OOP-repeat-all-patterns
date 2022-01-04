package Порождающие.Singletone;

public class SimpleExample {
    public static void main(String[] args) {
        SingleTonDB a = SingleTonDB.made(10);
    }
}

final class SingleTonDB{
    private static SingleTonDB sin;
    static int v;
    static {
        v = 100;
    }
    private SingleTonDB(){
        v = 10;
    }
    public static SingleTonDB made(int n){
        if(sin==null){
            sin = new SingleTonDB();
        }
        System.out.println(v);
        v +=n;
        return sin;
    }
}
