package Структурные.Bridge;

public class SimpleExample {
}


interface Car{
    public Engine eng = null;
}

class basicCar implements Car{
    public Engine eng = null;
}

class SportCar extends basicCar{

}

interface Engine{

}

class basicEngine implements Engine{

}
