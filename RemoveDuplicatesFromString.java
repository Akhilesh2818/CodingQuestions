public class RemoveDuplicatesFromString {
    public static void main(String[] args) {
        String name="Hello";
        int i=0;

        System.out.println(name.chars().distinct().collect(StringBuilder::new,StringBuilder::appendCodePoint,StringBuilder::append).toString()
        );

        try{
            System.out.println(i);
            i=29;
            System.out.println(i);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        finally {
            i =30;
            System.out.println(i);
        }
    }
}
