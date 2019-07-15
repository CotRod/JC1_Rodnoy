package lection12_Exceptions.objects;

public class MyException2 extends RuntimeException {
    private Exception myExcptn;

    public MyException2(String er, Exception e) {
        super(er);
        myExcptn = e;
    }

    public MyException2(String er) {
        super(er);
    }

    public Exception getHiddenException(){
    return myExcptn;
    }
}
