package Поведенческие.Command;

public class SimpleExample {
    public static void main(String[] args) {
        LoadCommand l = new LoadCommand();
        l.execute("file1");
        l.execute("file2");
        //...
        SaveCommand s = new SaveCommand();
        s.execute("file1.s");
        s.execute("file2.s");
        //...
    }
}


interface Command{
    void execute(String name);
}
class SaveCommand implements Command{


    @Override
    public void execute(String name) {
        System.out.print("Save file in "+name);
        //name.save.in.system
    }
}
class LoadCommand implements Command{


    @Override
    public void execute(String name) {
        System.out.print("Load file in "+name);
        //name.load.from.system
    }
}
