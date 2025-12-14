public class ThreadEx extends  Thread{

    public ThreadEx(String str)
    {
        super(str);
    }
    @Override
    public void run() {
        for(int i=0;i<1000;i++)
            System.out.println(i +": "+Thread.currentThread().getName());
    }

    public static void main(String[] args) throws InterruptedException {
        ThreadEx t1=new ThreadEx("t1");
        t1.start();
        t1.join();
        for (int i=0;i<100;i++)
        System.out.println("This is main thread");

    }
}
