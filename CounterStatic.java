public class CounterStatic {
    static int x=0;
    public static void main(String[] args) {

        for (int i=0;i<15;i++)
        {
            x++;
        }

        System.out.println(x
        );
        display();

    }
    public static void display(){
        System.out.println(x=x+1
        );
    }
}
