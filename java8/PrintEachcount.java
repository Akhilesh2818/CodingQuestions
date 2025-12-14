package java8;

public class PrintEachcount {
    public static void main(String[] args) {
        String input="aaabbcc";
        StringBuilder sb=new StringBuilder();
        int count=1;

        for(int i=1;i<input.length();i++)
        {
            if(input.charAt(i)==input.charAt(i-1))
            {
                 count++;
            }
            else {
                sb.append(input.charAt(i-1)).append(count);
                System.out.println(sb);
                count = 1;
            }
        }

        sb.append(input.charAt(input.length()-1)).append(count);
        System.out.println(sb);
    }
}
