package Поведенческие.ChainOfResponsobility;

public class SimpleExample {
    public static void main(String[] args) {

    }
}

interface Response{}

class SQLResponse implements Response{
    public SQLResponse(String res){}
}
class JSONResponse implements Response{
    public JSONResponse(String res){}
}

interface Checker{
    Response check(String response);
}
class SQLChecker implements Checker{

    @Override
    public Response check(String response) {
        if(response.charAt(0) == 1)
            return new SQLResponse(response);
        return null;
    }
}

class JSONChecker extends SQLChecker{
    @Override
    public Response check(String response){
        if(response.charAt(0) == 1)
            return new JSONResponse(response);
        return super.check(response);
    }
}