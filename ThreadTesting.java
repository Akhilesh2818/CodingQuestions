public class ThreadTesting extends Thread{

    public  void  run()
    {
        System.out.println("ThIS IS TRHEAD METHOD");
    }

    public static void main(String[] args) {
       ThreadTesting t1=new ThreadTesting();

        t1.start();


    }
}
