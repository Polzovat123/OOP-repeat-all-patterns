package Порождающие.Builder;

public class SimpleExample {
    public static void main(String[] args) {
        BossBuild boss = new BossBuild();
        System.out.println(boss.buildHttpRequestForSever1());
        System.out.println(boss.buildHttpRequestForSever2());
    }
}

class BossBuild{
    BuilderHttpRequest httpBuilder;
    public BossBuild(){
         httpBuilder = new BuilderHttpRequest();
    }
    public String buildHttpRequestForSever1(){
        httpBuilder.reset();
        httpBuilder.addIPAddress();
        return httpBuilder.getRequest();
    }
    public String buildHttpRequestForSever2(){
        httpBuilder.reset();
        httpBuilder.addIPAddress();
        httpBuilder.setUserName("Lebovski");
        return httpBuilder.getRequest();
    }
}

interface Builder{
    void reset();
    void addIPAddress();
    void setUserName(String name);
    void setTimeCode();
    void setHashCode();
}
class BuilderHttpRequest implements Builder{
    String req = "<>:<>:<>:<>";
    @Override
    public void reset() {
        req = "<>:<>:<>:<>";
    }

    @Override
    public void addIPAddress() {
        String ip = "12:12";
        req = req.substring(0, 1) + ip + req.substring(1);
    }

    @Override
    public void setUserName(String name) {
        int index = req.indexOf('<');
        index = req.indexOf('<', index+1);
        req = req.substring(0, index+1) + name + req.substring(index+1);
    }

    @Override
    public void setTimeCode() {

    }

    @Override
    public void setHashCode() {

    }
    public String getRequest(){
        return req;
    }
}

class BuilderUMlRequest implements Builder{

    @Override
    public void reset() {

    }

    @Override
    public void addIPAddress() {

    }

    @Override
    public void setUserName(String name) {

    }

    @Override
    public void setTimeCode() {

    }

    @Override
    public void setHashCode() {

    }
}