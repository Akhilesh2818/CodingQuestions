import java.util.Arrays;
import java.util.stream.IntStream;

public class OneToHunSumEven {
    public static void main(String [] args)
    {
        int sum= IntStream.range(1,101).filter(x->x%2==0).sum();
        System.out.println(sum);
    }
}
