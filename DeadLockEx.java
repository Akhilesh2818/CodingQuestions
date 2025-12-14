public class DeadLockEx {

    public synchronized void  display()  {
        System.out.println("This is displayMethod");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        display2();
    };

    public synchronized void display2(){

        System.out.println("This is display method2");
        display();
    }
    public static void main(String[] args) {

        DeadLockEx obj=new DeadLockEx();
        DeadLockEx obj1=new DeadLockEx();
        Runnable r1 =() ->{
            obj.display();
        };
        Runnable r2=() -> obj1.display2();

        Thread t1=new Thread(r1);
        Thread t2=new Thread(r2);
        t1.start();
        t2.start();
        System.out.println("This is main thread");

    }
}
