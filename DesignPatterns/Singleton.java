package DesignPatterns;

public class Singleton {
    private static Singleton instance;

     private Singleton(){

     }

     public static Singleton getInstance()
     {
         if(instance==null) {
             instance= new Singleton();
         }
         return instance;
     }
     public void showMessage()
     {
         System.out.println("Thi is singleton Instance");
     }
}

class SingletonExec{
    public static void main(String[] args) {
        Singleton obj=Singleton.getInstance();
        Singleton obj2=Singleton.getInstance();
        System.out.println(obj.hashCode()==obj2.hashCode());
    }
}
