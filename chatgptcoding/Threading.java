package chatgptcoding;

public class Threading {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("This is main Thread"+Thread.currentThread().getName());
        Runnable r1= () -> System.out.println("This if first thread" +Thread.currentThread().getName());

        Runnable r2= () -> System.out.println("This if second thread" +Thread.currentThread().getName());

        Thread t1=new Thread(r1);
        Thread t2=new Thread(r2);


        t1.start();

        t2.start();

        //t2.join();

        System.out.println("Main thread resumes after t2 finishes.");


    }
}
