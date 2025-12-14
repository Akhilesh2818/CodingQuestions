import java.sql.SQLOutput;

public class Comm {
    public static void main(String[] args)  {
        Thread t1=new Thread(() -> System.out.println("Thread1 is running"));
        Thread t2=new Thread(()-> System.out.println("Thread2 is running"));
        t1.start();

        try {
            t1.wait();
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
        System.out.println("Running main thread");
        t1.notify();
        t2.start();
    }
}
