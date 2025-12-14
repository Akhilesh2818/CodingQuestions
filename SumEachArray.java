public class SumEachArray {
    public static void main(String[] args) {
        int a[] ={123,45,6,78,9,888};

        for (int i=0;i<a.length;i++)
        {
            int num=a[i];
            int sum=0;

            while(num>0)
            {
              sum+=num%10;
              num=num/10;
            }
            System.out.println("Number: "+a[i]+" Sum of each digit is: "+sum);
        }
    }
}
