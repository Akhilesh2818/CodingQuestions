package Question240;

public  class Parent {

    public void display()
    {
        System.out.println("Parent method");
    }
}
class Child extends Parent{
    public void display()
    {
        System.out.println("Child method");
    }

    public static void main(String[] args) {
        Parent p1=new Parent();
        Parent p2=new Child();
        //Child c1=new Parent();
        Child c2=new Child();
        p1.display();
        p2.display();
        c2.display();
    }
}