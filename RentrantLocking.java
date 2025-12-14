import java.util.concurrent.locks.ReentrantLock;

public class RentrantLocking {
    public static void main(String[] args) {

        ReentrantLock lock=new ReentrantLock();
        Thread t1=new Thread(()->{
            lock.lock();
            for (int i=0;i<5;i++)
            {
                System.out.println("Inside First Thread");
            }
            lock.unlock();
        });
        Thread t2=new Thread(()->{
            lock.lock();
            for (int i=0;i<5;i++)
            {
                System.out.println("Inside 2 Thread");
            }
        });

        t1.start();
        t2.start();
        System.out.println("Main thread Running");
    }
}
