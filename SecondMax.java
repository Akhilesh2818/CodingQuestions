import java.util.Arrays;

public class SecondMax {
    public static void main(String[] args) {

        int [] maxelements={1,2,4,5,9,23,3432,78723};
        System.out.println(findSecondLargest(maxelements));
    }

    public  static int findSecondLargest(int []a)
    {
        Arrays.sort(a);

        return a[a.length-2];
    }
    public  static  int normalApp(int []b)
    {
         int max=0,secondmax=0;
        for (int num:b)
        {
            if (num>max)    // 1>0 sec=0 ,max=1  5>1 sec=1 max=5 , second=5 , max=6
            {
                secondmax=max;
                max=num;
            } else if (num>secondmax && num!=max) {
                secondmax=num;
            }
        }
        return secondmax;
    }
}


