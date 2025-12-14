public class ReverseVowelString {
    public static void main(String[] args) {
        String str = "Akhilesh";
        StringBuffer sb=new StringBuffer(str);
        String vow="aeiouAEIOU";
        int left=0;
        int right=sb.length()-1;

        while(left<right)
        {
            while (left<right && vow.indexOf(sb.charAt(left))==-1)
            {
                left++;

            }
            while (left<right && vow.indexOf(sb.charAt(right))==-1)
            {
                right--;
            }

            char temp = sb.charAt(left);
             sb.setCharAt(left,sb.charAt(right));
            sb.setCharAt(right, temp);
            left ++;
            right--;
        }
        System.out.println(sb);
    }
}
