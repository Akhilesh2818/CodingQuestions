public class OccurencesOfGivenCharacter {
    public static void main(String[] args) {
        String input="This is my country i love india";
        char replace='i';
        char arr[]=input.toCharArray();
        StringBuffer sb=new StringBuffer();

        System.out.println(replace(arr,replace,sb));

    }
    public static String replace(char [] arr ,char value,StringBuffer sb)
    {
         for (char i:arr)
         {
             if(i == value) {
                 continue;
             }
             else
                 sb.append(i);
         }
         return sb.toString();
    }
}
