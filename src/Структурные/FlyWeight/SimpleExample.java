package Структурные.FlyWeight;

public class SimpleExample {
    public static void main(String[] args) {

    }
}

class TreeFactory{
    void createOBJ(){}
}

class Forest{
    Tree[] trees;
    TreeFactory factory;
    public Forest(Tree[] arr, TreeFactory f){
        trees = arr;
        factory = f;
    }
    public void plant(){
        factory.createOBJ();
    }
    public void draw(){
        for(int i=0; i<3; i++){
            trees[i].draw();
        }
    }

}

class Tree{
    TreeType type;
    int x, y;
    public void draw() {
        System.out.print("Draw");
    }
}

class TreeType{
    String picture;
    String color;
}