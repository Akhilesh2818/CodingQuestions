package CodingQuestion;

import java.util.Arrays;

public class AnagramCheck {
    public static void main(String[] args) {
        System.out.println(anagramChecker(" ", " ")); // true

    }
    public  static boolean anagramChecker(String s1,String s2)


    {     if(s1==null || s2 ==null || s1.length()!=s2.length())
    {
        return  false;
    }

         char [] first=s1.toCharArray();
         char [] second=s2.toCharArray();

        Arrays.sort(first);
        Arrays.sort(second);

        return Arrays.equals(first, second);
    }
}
