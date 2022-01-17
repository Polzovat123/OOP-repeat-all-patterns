package Структурные.Facade;

public class SimpleExample {
    public static void main(String[] args) {
        MyFrmFacade obj = new MyFrmFacade();
        obj.convertFile();
    }
}


class MyFrmFacade{
    public void convertFile(){
        //some logic with work to framework
    }
}