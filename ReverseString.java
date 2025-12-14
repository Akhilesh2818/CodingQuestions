public class ReverseString {

    public static void main(String[] args) {
        String s="akhile$sht";
        char [] value=s.toCharArray();
        int left = 0, right = value.length - 1;
        while (left < right) {

            if (!Character.isLetter(value[left])) {
                left++;
            } else if (!Character.isLetter(value[right])) {
                right--;
            } else {
                char temp = value[left];
                value[left] = value[right];
                value[right] = temp;
                left++;
                right--;
            }
        }
        System.out.println(new String(value));

    }
}
