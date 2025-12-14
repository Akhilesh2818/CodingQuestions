import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class CyclicBarrierEx {
    public static void main(String [] args)
    {
        CyclicBarrier cb =new CyclicBarrier(4,()->System.out.println("All the Thread Reached barriers"));
        for(int i=0;i<5;i++){
            new Thread(()-> {
                System.out.println("Current Thread:" + Thread.currentThread().getName()
                        + Thread.currentThread().getState());


;
                try {
                    cb.await();
                   // throw new RuntimeException("Thi is runtime excepiton");
                } catch (BrokenBarrierException e) {
                    throw new RuntimeException(e);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }).start();

        }
    }
}
