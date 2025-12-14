import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableEx implements Callable<Integer> {
    public static void main(String[] args) throws Exception {
        CallableEx callM=new CallableEx();
        ExecutorService obj=Executors.newFixedThreadPool(1);
        Future<Integer> result= obj.submit(callM);
        System.out.println(result.get());
        obj.shutdown();

    }

    @Override
    public Integer call() throws Exception {
        return 9+1;
    }
}
