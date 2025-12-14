package java8;

public class FibonaciSeriesRec {
    public static void main(String[] args) {
        // 0 , 1, 1, 2,3,5,8,13
        FibonaciSeriesRec obj=new FibonaciSeriesRec();
       int result= obj.fibonacci(9);
        System.out.println(result);

    }
    public int fibonacci(int n)
    {
        if(n<=1)
            return n;

        return fibonacci(n-1)+fibonacci(n-2);
    }
}
