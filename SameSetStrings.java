import java.util.Arrays;

public class SameSetStrings {
    public static void main(String [] args)
    {
        String first="abc";
        String second="bacd";
        System.out.println(checkTwoStrings(first,second));

    }

    public  static boolean checkTwoStrings(String obj,String obj1){
        if (obj.length()!=obj1.length())
        {
            return  false;
        }
        char [] one=obj.toCharArray();
        char []two=obj1.toCharArray();

        Arrays.sort(one);
        Arrays.sort(two);

        return Arrays.equals(one,two);
    }

}
