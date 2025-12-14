public class ReverseVowels {
    public static void main(String[] args) {
        System.out.println(ReverseVowels.reverseVowels("IceCreAm"));

    }
    public static String reverseVowels(String s) {

        StringBuilder sb=new StringBuilder(s);
        StringBuilder vo=new StringBuilder();
        char []vowels={'a','A','e','E','I','i','o','O','u','U'};
        int len=sb.length();
        int len1=vowels.length;
        int i=0; int j=0;

        for(j=0;j<len1 && i<len;j++){

            if(sb.charAt(i)==vowels[j])
            {
              vo.append(sb.charAt(i));

            }
            i++;
        }
        System.out.println("Vowels String  "+vo);
        int x=vo.length();

        for(j=0;j<len1 && i<len;j++){

            if(sb.charAt(i)==vowels[j])
            {
                sb.setCharAt(i, vo.charAt(x--));

            }
            i++;
        }
        return sb.toString();
    }
}
