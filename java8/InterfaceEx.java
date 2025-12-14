package java8;

 interface Test{
     public  void test();
     public  static void display ()
     {
         System.out.println("Thi is static method in java");
     }
 }
public class InterfaceEx implements Test {

    public static void main(String[] args) {

        InterfaceEx t = new InterfaceEx();
            Test.display();


    }

    @Override
    public void test() {
        System.out.println("This is test account");
    }
}
