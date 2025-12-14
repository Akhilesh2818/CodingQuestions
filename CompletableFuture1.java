import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CompletableFuture1 {
    public static void main(String[] args) {
        // Introduced in java 8

        CompletableFuture<String> greetingFuture
                = CompletableFuture.supplyAsync(() -> {
            // some async computation
            return "Hello from CompletableFuture";
        });

        try {
            System.out.println(greetingFuture.get());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }

    }
}
