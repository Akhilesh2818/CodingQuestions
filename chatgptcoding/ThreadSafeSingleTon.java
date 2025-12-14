package chatgptcoding;

public class ThreadSafeSingleTon {
    private static ThreadSafeSingleTon instance ;

    public  synchronized ThreadSafeSingleTon getInstance(){
        if (instance ==null) {
            instance = new ThreadSafeSingleTon();
        }
        return  instance;
    }
}
