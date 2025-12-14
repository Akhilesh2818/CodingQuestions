import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorTest {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService obj =Executors.newFixedThreadPool(3);
        for(int i=0;i<500;i++)
        {
            int finalI = i;
            Future<?> submit = obj.submit(() -> System.out.println(finalI +"Executing Thread name" +
                    Thread.currentThread().getName()),"success");
           // System.out.println(submit.get());
        }
        obj.shutdownNow();

        System.out.println();

    }
}
