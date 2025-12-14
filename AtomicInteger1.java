import java.util.concurrent.atomic.AtomicInteger;

class Counter {
    AtomicInteger count=new AtomicInteger(0);
    public  void increment(){
        count.getAndIncrement();
    }
}
public class AtomicInteger1 {
    public static void main(String[] args) throws InterruptedException {
        Counter t=new Counter();

        Runnable t1=() ->{
            for (int i=0;i<1000;i++)
            {
                t.increment();
            }
        };

        Thread first= new Thread(t1);
        Thread two=new Thread(t1);
        first.start();
        two.start();
        Thread.sleep(6000);
        System.out.println(t.count);
    }



}
