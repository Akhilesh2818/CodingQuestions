public class MaxProducts {
    public static void main(String [] args)
    {
        int []a={1,4,3,6,7,7,0};
        int len=a.length;
        int product=0;
        // find max product of two distinct elements in an array
        for (int i=0;i<len;i++)
        {
            for (int j=i+1;j<len;j++)
            {
                int temp=a[i]*a[j];

                if(temp>product && a[i]!=a[j])
                {
                    product=temp;
                }

            }
        }
        System.out.println(product);
    }
}
