public class CreateThreads {
    public static void main(String[] args) {
        System.out.println("Processors: " + Runtime.getRuntime().availableProcessors());

        for (int i = 0; i < 20000; i++) {
            new Thread(() -> {
                while(true) {} // consumes 100% CPU
            }).start();
        }

        System.out.println("Done creating threads.");
    }
}
