public class ExceptionHandler {
    public static void main(String[] args) {
        try{
            System.out.println("X");
            problematicMethod();
            System.out.println("Y");
        }
        catch (Exception e)
        {
            System.out.println("Z");
        }
        finally {
            System.out.println("Final");
        }
    }
    public  static void problematicMethod() throws Exception {
       throw new Exception("this is an exception");
    }
}

