public class ReverseStrig {
    public static void main(String[] args) {
        System.out.println(ReverseStrig.reverseString("abc"));
        System.out.println(ReverseStrig.reverseString1("abc"));
    }

    public  static String reverseString(String str)
    {
        StringBuffer sb=new StringBuffer(str);
        return  sb.reverse().toString();
    }

    public static String reverseString1(String str)
    {
        char ch[]=str.toCharArray();
        StringBuffer rev=new StringBuffer();
        for (int i=ch.length-1;i>=0;i--)
        {
          rev.append(ch[i]);
            System.out.println(rev.hashCode());
        }
        return  rev.toString();
    }
}
