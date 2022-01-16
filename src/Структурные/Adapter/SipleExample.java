package Структурные.Adapter;

public class SipleExample {
    public static void main(String[] args) {
        JElectronicBookAdapter myElecBook = new JElectronicBookAdapter(new JBook(10));

        while(myElecBook.checkHavePower() && myElecBook.isEnd()){
            myElecBook.read();
            myElecBook.movePage(6);
        }
    }
}

interface Book{
    void read();
    void movePage(int dx);
    boolean isEnd();
    default void print(Object SomeText){
        System.out.print(SomeText);
    }
}

class JBook implements Book{
    public String Name;
    public String Author="People: ";
    public int pages;
    private String[] Text;
    public int nowPages;

    public JBook(int sizeBook){
        nowPages = 0;
        Text = new String[sizeBook];
        pages = sizeBook;
        for(int i=0; i<sizeBook; i++){
            Text[i] = i +" pages now you read one list \n";
        }
    }

    @Override
    public void read() {
        print(Author+Text[nowPages]);
    }

    @Override
    public void movePage(int dx) {
        if(dx>0){
            nowPages++;
        }else{
            nowPages--;
        }
    }

    @Override
    public boolean isEnd() {
        return !(nowPages>=pages);
    }
}

interface ElectronicBook{
    void read();
    void charge();
    boolean checkHavePower();
    void movePage(int dx);
    boolean isEnd();
}

class JElectronicBookAdapter implements ElectronicBook{
    private JBook base;
    public JElectronicBookAdapter(JBook b){
        base = b;
    }

    @Override
    public void read() {
        base.read();
    }

    @Override
    public void charge() {
        //nothing because book not need charge
    }

    @Override
    public boolean checkHavePower() {
        return true;//it always works
    }

    @Override
    public void movePage(int dx) {
        if(dx>0){
            if(base.nowPages+dx< base.pages){
                moveFor(dx, 1);
            }else{
                moveFor(base.pages - base.nowPages, 1);
            }
        }
        if(dx<0){
            if(base.nowPages+dx>0){
                moveFor(dx, -1);
            }else{
                moveFor(base.nowPages, -1);
            }
        }
    }

    @Override
    public boolean isEnd() {
        return base.isEnd();
    }

    private void moveFor(int count, int vec){
        for(int i=0; i<count; i++){
            base.movePage(vec);
        }
    }
}