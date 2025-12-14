public class DeadLockExampleActual {

    private final Object lock1=new Object();
    private final Object lock2=new Object();

    public void method1(){
        synchronized (lock1)
        {
            System.out.println("This is in method 1 and acquired lock1");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            synchronized (lock2)
            {
                System.out.println("This is in method1 and want to acquire lock2");
            }
        }
    }

    public void method2(){
        synchronized (lock2)
        {
            System.out.println("This is in method 2 and acquired lock2");

            synchronized (lock1)
            {
                System.out.println("This is in mehtod2 and want to acquire lock1");
            }
        }
    }

    public static void main(String[] args) {
         DeadLockExampleActual
            d = new DeadLockExampleActual();

        new Thread(() -> d.method1()).start();
        new Thread(() -> d.method2()).start();
    }
}
