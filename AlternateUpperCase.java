public class AlternateUpperCase {
    public static void main(String[] args) {
        String str="How are You Akhilesh";

        StringBuffer sb =new StringBuffer();

        for(int i=0;i<str.length();i++)
        {
            if(i%2==0)
            {
                sb.append(Character.toUpperCase(str.charAt(i)));
            }
            else sb.append(str.charAt(i));
        }
        System.out.println(sb);

    }
}
