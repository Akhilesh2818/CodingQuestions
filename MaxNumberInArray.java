public class MaxNumberInArray {

    public static void main (String [] args)
    {
         int result[]={3,4,5,14,89,2,4,900,1090};
        System.out.println( MaxArray(result));
    }

    public static int MaxArray(int []a)
    {
         int max=0;

        for (int i=0;i<a.length;i++)
        {
            if(max<a[i])
            {
                max=a[i];
            }
        }
        return  max;
    }
}
