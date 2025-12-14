import java.util.LinkedHashSet;

public class UniqueAsciiString {
    public static void main(String[] args) {

        String input = "Akhilesh is a good boy";

        LinkedHashSet<Character> set = new LinkedHashSet<>();

        // Remove duplicates but keep the order
        for (char c : input.toCharArray()) {
            if (c != ' ') {  // ignore spaces (optional)
                set.add(c);
            }
        }

        // Build ASCII output string
        StringBuilder sb = new StringBuilder();
        for (char c : set) {
            sb.append((int) c); // ASCII value
        }

        // Final ASCII string
        System.out.println(sb.toString());
    }
}
