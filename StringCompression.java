import java.util.Arrays;
import java.util.Collections;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StringCompression {
    public static void main(String[] args) {
        String str="aabbccdddd";
        // a == a true  count 2
        // i=2  b==a X else sb=a2
        // i=3 b=b cout =2
        //i=4
        //char [] res=result.toCharArray();

        StringBuilder sb = new StringBuilder();
        int count = 1;

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(i - 1)) {
                count++; // same char → increase count
            } else {
                sb.append(str.charAt(i - 1)).append(count); // append char+count
                System.out.println(sb);
                count = 1; // reset count
            }
        }
        // last character group
        sb.append(str.charAt(str.length() - 1)).append(count);

        System.out.println(sb);
    }
}
