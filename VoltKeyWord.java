public class VoltKeyWord {

    static volatile boolean running = true;
    public static void main(String[] args) {
      VoltKeyWord.running=false;
        System.out.println(VoltKeyWord.running);

    }
}
