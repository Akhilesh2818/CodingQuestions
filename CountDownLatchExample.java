import java.util.concurrent.CountDownLatch;

public class CountDownLatchExample {
    public static void main(String [] args) throws InterruptedException {
        CountDownLatch obj=new CountDownLatch(8);
        for (int i=0 ; i<8;i++) {
            new Thread(() -> {System.out.println("Running Thread is:" +
                    Thread.currentThread().getName()+Thread.currentThread().getState());
                    obj.countDown();
            }).start();

        }
        obj.await();
        System.out.println("All the Task are completed");
    }
}
