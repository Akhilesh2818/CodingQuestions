public class SpecialCharacterString {
    public static void main(String[] args) {
        String input ="akhilesh@india$loves*re";

        System.out.println( getSpecialChars(input));
    }
    public static String getSpecialChars(String input) {
        return input.replaceAll("[a-zA-Z0-9]", "");
    }
}
