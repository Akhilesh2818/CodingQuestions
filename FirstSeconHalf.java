public class FirstSeconHalf {
    public static void main(String[] args) {
        String str="Rahulindia";
        int len=str.length();
        String result=str.substring(0,len/2).toUpperCase()+str.substring(len/2,len).toLowerCase();
        System.out.println(result);

    }
}
