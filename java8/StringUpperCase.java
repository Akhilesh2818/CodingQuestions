package java8;

import java.util.Arrays;
import java.util.List;

public class StringUpperCase {
    public static void main(String[] args) {
        List<String> st= Arrays.asList("akhil","rishi","kajal","shonna");

        st.stream().map(s->s.toUpperCase()).forEach(System.out::println);
    }
}
