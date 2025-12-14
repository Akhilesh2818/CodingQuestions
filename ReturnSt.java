public class ReturnSt {
    public static void main(String[] args) {

    }

    public int get(){
        try{
            System.out.println("This ist ry");
            return 3;
        }
        catch (Exception e)
        {
            System.out.println("Exception");
            return 5;
        }
        finally {
            return 9;
        }
        //return 10;
    }
}
