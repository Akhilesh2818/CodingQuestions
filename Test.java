// A Java program to show that references are also passed
// by value.
class Test {
    String colour="";

    public Test(String s) {
        colour=s;
    }
}

class MainTest {
    public static void main(String[] args)
    {
        Test red =new Test("Red");
        Test blue =new Test("Blue");
        System.out.println("Red hashcode:"+red.hashCode() +"Blue hashcode:"+blue.hashCode());
        swap(red,blue);
        System.out.println(red.colour + blue.colour);
    }
    public static void swap(Object o1, Object o2) { // o1 = 50, o2 = 100
        Object temp = o1; // assign the object reference value of o1 to temp: temp = 50, o1 = 50, o2 = 100
        o1 = o2; // assign the object reference value of o2 to o1: temp = 50, o1 = 100, o2 = 100
        o2 = temp; // assign the object reference value of temp to o2: temp = 50, o1 = 100, o2 = 5
        System.out.println(o1.hashCode() + "O2 Hashcode:" + o2.hashCode());

    }
}
