public class InternTesting {
    public static void main(String []args)
    {
        String s=new String("hello");
        String s1="hello";
        System.out.println(s.hashCode() +" s1 hascode is  " + s1.hashCode());
        System.out.println(s.intern().equals("hello"));

    }
}
