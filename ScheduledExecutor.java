

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledExecutor {
    public static void main(String[] args) {
        ScheduledExecutorService scheduledExecutorService =
                Executors.newSingleThreadScheduledExecutor();
        scheduledExecutorService.scheduleAtFixedRate(
                () -> System.out.println("This is Scheduled eXECUTOR Service"),
                5,
                5,
                TimeUnit.SECONDS

        );
        scheduledExecutorService.schedule( () ->{
                System.out.println("Intializing shutdonw");
                scheduledExecutorService.shutdown();},
        20,
        TimeUnit.SECONDS
        );

    }
}
