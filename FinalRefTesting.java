public class FinalRefTesting
{
    public static void main(String[] args) {
        final int a=10;
        System.out.println(a);
       int b=a;
       b=10;
        System.out.println(b==a);
        final Integer s=new Integer(10);
        final Integer s1=new Integer(10);

        System.out.println("s1==s" + (s1==s));
        System.out.println("a==s" + (a==s) + s.hashCode());

    }
}
